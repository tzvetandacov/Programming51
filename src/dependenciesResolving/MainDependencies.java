package dependenciesResolving;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class MainDependencies {

	public static void main(String[] args) {

		ArrayList<Dict> localDependencies = new ArrayList<Dict>();
		ArrayList<String> locDepNames = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter the count of dependencies in localDependencies: ");
		int count = input.nextInt();

		for (int i = 0; i < count; i++) {
			Dict temp = new Dict();
			System.out.printf("Enter name of dependency No %d: ", (i + 1));
			// String nameDep = input.next();
			locDepNames.add(input.next());

			ArrayList<String> locDepDeps = new ArrayList<String>();
			System.out.printf("Enter the count of dependencies for %s:",
					locDepNames.get(i));
			int countDep = input.nextInt();
			for (int iD = 0; iD < countDep; iD++) {
				System.out.printf("Enter name of %s dependency No %d: ",
						locDepNames.get(i), (iD + 1));
				locDepDeps.add(input.next());

			}
			temp.add(locDepNames.get(i), locDepDeps);
			localDependencies.add(temp);

		}
		// System.out.println(localDependencies.toString());
		ArrayList<String> installedModules = new ArrayList<String>();
		System.out.println("Enter the count of installed modules: ");
		int countInstallMod = input.nextInt();
		for (int i = 0; i < countInstallMod; i++) {
			System.out.printf("Enter the name of the module No %d:", i + 1);
			installedModules.add(input.next());

		}
		// System.out.println(installedModules.toString());

		ArrayList<Dict> allPackages = new ArrayList<Dict>();
		ArrayList<String> allPackNames = new ArrayList<String>();
		System.out.println("Enter the count of the packages to be installed: ");
		int count2 = input.nextInt();

		for (int i = 0; i < count2; i++) {
			Dict temp = new Dict();
			System.out.printf("Enter the name of package No %d: ", (i + 1));
			// String nameDep = input.next();
			allPackNames.add(input.next());

			ArrayList<String> AllPackDeps = new ArrayList<String>();
			System.out.printf("Enter the count of dependencies for %s:",
					allPackNames.get(i));
			int countDep = input.nextInt();
			for (int iD = 0; iD < countDep; iD++) {
				System.out.printf("Enter name of %s dependency No %d: ",
						allPackNames.get(i), (iD + 1));
				AllPackDeps.add(input.next());

			}
			temp.add(allPackNames.get(i), AllPackDeps);
			allPackages.add(temp);
			// input.close();
			// ///////////////////////////////////////////////////////////////////////////////////////////

		}
		ArrayList<Dict> toInstallQueue = new ArrayList<Dict>();
		for (Dict dict : localDependencies) {
			toInstallQueue.add(dict);

		}
		for (Dict dict : allPackages) {
			toInstallQueue.add(dict);

		}
		ArrayList<String> alreadyInstalled = new ArrayList<String>();
		for (String installedModule : installedModules) {
			alreadyInstalled.add(installedModule);
		}
		Stack<Dict> toInstallStack = new Stack<Dict>();

		toInstallStack.add(toInstallQueue.get(0));
		toInstallQueue.remove(0);
		// /////////////////////////////////////////////////////////////////////////

		// /////////////////////////////////////////////////////////////////////////
		while (!toInstallStack.isEmpty()) {
			//System.out.println("for instal: " + toInstallStack.peek().packName);
			String forInstalNoDep = toInstallStack.peek().packName;
			ArrayList<String> justInstalled = new ArrayList<String>();
			if (toInstallStack.peek().dependencies.isEmpty()) {
				for (String pack : installedModules) {
					if (toInstallStack.peek().packName.equals(pack)) {
						System.out.printf("%s is already installed.%n",
								pack);
						// 106 !!!! //// index 0 instead of:
						// (toInstallStack.size() - 1)
						toInstallStack.remove(toInstallStack.size() - 1);

						// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						for (Dict token : toInstallQueue) {
							if (token.packName.equals(pack)
									&& !toInstallQueue.isEmpty()) {
								toInstallQueue.remove(token);
							}
						}

						// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

						// adding changes:
						if (!toInstallQueue.isEmpty()) {
							toInstallStack.add(toInstallQueue.get(0));
							toInstallQueue.remove(0);
						}
						// ////
					}

				}
				if (toInstallStack.peek().packName.equals(forInstalNoDep)) {
					System.out.printf(
							"Installing %s...%n",
							toInstallStack.peek().packName);

					justInstalled.add(toInstallStack.peek().packName);
					toInstallStack.remove(toInstallStack.size() - 1);

					if (toInstallStack.isEmpty() && !toInstallQueue.isEmpty()) {
						toInstallStack.add(toInstallQueue.get(0));
						toInstallQueue.remove(0);
						
						
					}
				}
				// //////
			} else {
				System.out.printf(
						"In order to install %s, we first need to install ",
						toInstallStack.peek().packName);
				ArrayList<String> tempDep = new ArrayList<>();
				// System.out.println("В Else-a сме:");
				// for (String string : toInstallStack.peek().dependencies) {
				// System.out.println("dep: " + string.toString());
				// }
				for (String string : toInstallStack.peek().dependencies) {
					tempDep.add(string);
				}
			
				for (int i = 0; i < tempDep.size(); i++) {
					if (i != (tempDep.size() - 1)) {
						System.out.printf("%s and ", tempDep.get(i));
					} else {
						System.out.println(tempDep.get(i) + ".");
					}
					for (String installed : installedModules) {
						if (installed.equals(tempDep.get(i))) {
							System.out.printf(
									"%s is already installed.%n",
									installed);

							// for (Dict token : toInstallQueue) {
							// if (token.packName.equals(installed)) {
							// toInstallQueue.remove(token);
							// }
							// }
							// System.out.println(dep.toString());
							toInstallStack.peek().dependencies.remove(installed);
/* !!!!!!! */							toInstallQueue.remove(tempDep.get(i));
toInstallQueue.remove(tempDep.get(i));
toInstallQueue.remove(tempDep.get(i));
toInstallQueue.remove(tempDep.get(i));
toInstallQueue.remove(tempDep.get(i));
toInstallQueue.remove(tempDep.get(i));}
					}ArrayList<Dict> toRemInst = new ArrayList<Dict>();
					for (int j = 0; j < toInstallQueue.size(); j++) {
						toRemInst.add(toInstallQueue.get(j));
					}
					
					for (Dict token : toRemInst) {
						if (token.packName.equals(tempDep.get(i))) {
							toInstallStack.add(token);																				
							toInstallQueue.remove(token);
						}
					}
				}
			}

			// else{
			// System.out.printf("%s is installing...%n",toInstallStack.peek().packName);
			// justInstalled.add(toInstallStack.peek().packName);
			// toInstallStack.remove(toInstallStack.size()-1);
			// toInstallStack.add(toInstallQueue.poll());
			// }
			for (String string : justInstalled) {
				installedModules.add(string);
			}
		}
		if (toInstallStack.isEmpty() && toInstallQueue.isEmpty()) {
			System.out.println("All done!");
			System.out.println("installedModules are:");
			for (String installed : installedModules) {
				System.out.println(installed);
			}
		} else {
			for (Dict dict : toInstallStack) {

				System.out.printf(
						"%s were not installed, I still dont know why...%n",
						dict.packName);
			}
		}
	}

}

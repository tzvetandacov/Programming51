package dependenciesResolving;
import java.util.ArrayList;
public class Dict {
	public String packName;
	public ArrayList<String> dependencies;

	public void add(String packName, ArrayList<String> dependencies) {
		this.packName = packName;
		this.dependencies = dependencies;
	}
	public String toString(){
		String result = this.packName + ":";
		
		return result;
	}
	// Queue toInstallQueue ; Stack toInstallStack ; ArrayList<String> installedModules;
	
public void installOrStack(Dict pack){
		if(pack.dependencies.isEmpty()){
			
		}
	}
}

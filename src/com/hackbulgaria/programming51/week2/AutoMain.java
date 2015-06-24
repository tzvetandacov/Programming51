package com.hackbulgaria.programming51.week2;

import org.omg.CORBA.PUBLIC_MEMBER;

public class AutoMain {

	public static void main(String[] args) {
		Person tzvetandacov = new Person("Tzvetan", "Dacov", 30);
		Auto vectra = new Auto(tzvetandacov,180, "Opel","Vectra",3000);
		
		System.out.println(vectra);
		System.out.println(tzvetandacov);
		
		

	}

}

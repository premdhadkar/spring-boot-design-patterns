package com.premdroid.designpatterns.creational.factory;

public class FactoryExample {

	public static void main(String[] args) {
		
		/*
		 * The amazing thing about Factory Design pattern is that,
		 * In future,if a new operating system is developed, the client code 
		 * {line 13,14,15} will be the same, and no changes will be required 
		 * in the client code.
		 * */
		
		OS os;
		os = OperatingSystemFactory.getInstance("Open");
		os.show();
		
	}

}

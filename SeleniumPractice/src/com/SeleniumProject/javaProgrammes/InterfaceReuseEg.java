package com.SeleniumProject.javaProgrammes;

public class InterfaceReuseEg {

	public static void main(String[] args) {
		
		InterfaceEg iie1 = new InterfaceimplementsEg1();
		iie1.Vehicle();
		
		InterfaceEg iie2 = new InterfaceImplentsEg2();
		iie2.Vehicle();
	}

}

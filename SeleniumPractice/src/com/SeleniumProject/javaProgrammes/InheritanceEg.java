package com.SeleniumProject.javaProgrammes;

public class InheritanceEg extends MethodsEg {

	public static void main(String[] args) {
		
		Function1();
		System.out.println("*****************************");
		MethodsEg me = new MethodsEg();
//		me.Function3();
		
		me.Function1();
	}

	public static void Function1(){
		System.out.println("This is InheritanceEg Function1 code");
	}
}

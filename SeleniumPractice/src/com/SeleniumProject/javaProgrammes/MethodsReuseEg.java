package com.SeleniumProject.javaProgrammes;

public class MethodsReuseEg {

	public static void main(String[] args) {
		
		MethodsEg me = new MethodsEg();
		
		me.Function1();
		
		int res = me.sum(40, 60);
		System.out.println(res);
		
		
		res = me.sum(30, 70, 50);
		System.out.println(res);

	}

}

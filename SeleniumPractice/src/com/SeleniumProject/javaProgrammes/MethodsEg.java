package com.SeleniumProject.javaProgrammes;

public class MethodsEg {
//	MethodsEg(String x, int y){
//		System.out.println(x + " This is MethodsEg class constructor " + y);
//	}
//	
//	MethodsEg(String x, int y, boolean flag){
//		System.out.println(x + " This is MethodsEg class constructor " + y +" "+ flag);
//	}

	public static void main(String[] args) {
		
		Function1();
		char x = Function2();
		System.out.println(x);
		
		MethodsEg me = new MethodsEg();
		me.Function3();
		
		boolean flag = me.Function4();
		System.out.println(flag);
	}
	
	//Static method without returning any value
	 public static void Function1(){
		System.out.println("This is Function1 Method code");
	}
	
	//Static Method With returning value
	public static char Function2()
	{
		System.out.println("This is Function2 method code");
		return 'M';
	}
	
	//Non Static Method without returning any value
	public void Function3(){
		System.out.println("This is Function3 method code");
	}

	//Non Static Method With returning value
	public boolean Function4(){
		System.out.println("This is Function4 Method Code");
		return true;
	}
	
	public int sum(int a, int b)
	{
		int c = a + b;	
		return c;
	}
	
	public int sum(int a, int b, int c)
	{
		int d = a + b + c;
		return d;
	}
}

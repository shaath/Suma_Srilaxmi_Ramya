package com.SeleniumProject.javaProgrammes;

public class StaticArrayEg {

	public static void main(String[] args) {
		
		int[] intSalary = {10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000};
		
//		System.out.println(intSalary[1]);
//		System.out.println(intSalary.length);
		
//		for (int i = 0; i < intSalary.length; i++) {
//			
//			System.out.println(intSalary[i]);
//		}
		
		for(int data: intSalary){
			
			System.out.println(data);
		}

	}

}

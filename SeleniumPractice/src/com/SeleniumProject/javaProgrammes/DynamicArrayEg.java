package com.SeleniumProject.javaProgrammes;

public class DynamicArrayEg {

	public static void main(String[] args) {
		
		Object[] dArray = new Object[5];
		
//		System.out.println(dArray.length);
		
//		System.out.println(dArray[3]);
		
		dArray[1] = "Selenium";
		dArray[3] = 67389067;
		dArray[1] = 'M';
		
		for(Object data: dArray){
			System.out.println(data);
		}
	}

}

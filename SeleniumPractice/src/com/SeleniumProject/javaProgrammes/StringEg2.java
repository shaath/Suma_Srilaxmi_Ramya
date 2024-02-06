package com.SeleniumProject.javaProgrammes;

public class StringEg2 {

	public static void main(String[] args) {
		String x = "I am learning Selenium with java";
		
		String[] y = x.split(" ");
		System.out.println(y.length);
		
//		System.out.println(y[3]);
//		for(int i = 0; i < y.length; i++){
//			System.out.println(y[i]);
//		}
		
		for(String data : y){
			System.out.println(data);
		}
		

	}

}

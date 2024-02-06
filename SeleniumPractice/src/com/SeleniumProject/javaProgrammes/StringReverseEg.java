package com.SeleniumProject.javaProgrammes;

public class StringReverseEg {

	public static void main(String[] args) {
		String x = "Malayalam";  // muineleS
 		String r = "";
		int len = x.length();
//		for(int i = len-1; i >= 0; i--){
//			System.out.print(x.charAt(i));
//		}
		
		for(int i = len-1; i >= 0; i--){
			r = r + x.charAt(i);
		}
		
		System.out.println(r);

		if(x.equalsIgnoreCase(r)){
			System.out.println("Given String ia polindrome");
		}else{
			System.out.println("Given String is not a polindrome");
		}
	}

}

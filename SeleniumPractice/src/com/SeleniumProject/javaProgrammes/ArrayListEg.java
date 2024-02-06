package com.SeleniumProject.javaProgrammes;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEg {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
		
		al.add("Selenium");
		al.add(60000);
		al.add(true);
		al.add(6346.43634);
		al.add('M');
		al.add("Apple");
		al.add(6, "Java");
		al.add("Selenium");
//		al.clear();
//		al.remove(4);
//		al.remove(true);
//		al.add(2, "Sharath");
		al.set(2, "UFT");
		
		List<Object> sl = al.subList(3, 8);
		System.out.println(sl);
		
		
//		System.out.println(al.size());
//		
////		System.out.println(al.get(2));
//
//		for(int i=0; i < al.size(); i++){
//			System.out.println(al.get(i));
//		}
		
	}

}

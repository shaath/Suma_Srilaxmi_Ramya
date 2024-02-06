package com.SeleniumProject.javaProgrammes;

import java.util.HashSet;

public class HashSetEg {

	public static void main(String[] args) {
		
		HashSet<Object> hs = new HashSet<>();
		
		hs.add("Apple");
		hs.add('M');
		hs.add(3252);
		hs.add("Boll");
		hs.add("Cat");
		hs.add("Apple");
		
		System.out.println(hs.size());
		
		for(Object data: hs){
			System.out.println(data);
		}

	}

}

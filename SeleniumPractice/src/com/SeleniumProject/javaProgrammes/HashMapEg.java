package com.SeleniumProject.javaProgrammes;

import java.util.HashMap;
import java.util.Map;

public class HashMapEg {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("January", 1);
		hm.put("Febraury", 2);
		
//		System.out.println(hm.size());

//		System.out.println(hm.get("January"));
		
		System.out.println(hm.containsKey("January"));
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
//		for(Map.Entry<String, Integer> data: hm.entrySet())
//		{
//			System.out.println(data.getKey() + "----" + data.getValue());
//		}
	}

}

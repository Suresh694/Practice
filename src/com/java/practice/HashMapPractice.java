package com.java.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map1= new HashMap<>();
		map1.put(1, "suresh");
		map1.put(2, "aman");
		for (Map.Entry<Integer, String> entry : map1.entrySet()) {
			System.out.println("Key"+entry.getKey()+"Value"+entry.getValue());
		}

	}

}

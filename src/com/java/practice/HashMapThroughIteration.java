package com.java.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapThroughIteration {

	public HashMapThroughIteration() {
		// TODO Auto-generated constructor stub
		HashMap<Integer, String> map= new HashMap<Integer, String>();
		map.put(1, "Suresh");
		map.put(2, "Dhiraj");
		map.put(3, "aman");
		
		Iterator<Map.Entry<Integer, String>> itr= map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry=itr.next();
			System.out.println("Key"+entry.getKey()+" Value"+entry.getValue());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapThroughIteration obj=new HashMapThroughIteration();
		
	}

}

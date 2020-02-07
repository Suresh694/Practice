package com.java.practice;

import java.awt.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="suresh";
		
		System.out.println(s.length());	
		
		String reverse="";
		for (int i = s.length()-1; i >=0; i--) {
			reverse= reverse +s.charAt(i);
			
		}
		System.out.println(reverse);

	}

}

package com.java.practice;

public class ReplacewithNext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="suresh";
		char[] charArray=str.toCharArray();
		
		for (int i = 0; i < charArray.length-1; i++) {
			if (i+1==charArray.length) {
				charArray[i+1]=charArray[0];
				System.out.println(charArray[i]);
			}
			else {
				charArray[i]=charArray[i+1];
				System.out.println(charArray[i]);
			}
			
		}
		
	}

}

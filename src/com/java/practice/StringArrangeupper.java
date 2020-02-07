package com.java.practice;

public class StringArrangeupper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Suresh";
		char[] charArray=str.toCharArray();
		int length=charArray.length;
		char[] charArray2= new char[2*length];
		System.out.println("Length of charArray2:-"+charArray2.length);
		for (int i = 0; i < charArray2.length; i++) {
			
			  Character c=charArray[i]; 
			  charArray2[2*i]=c; System.out.print(c); if (c>='A'
			  && c<='Z') { System.out.print(c.toLowerCase(c));
			  charArray2[2*i+1]=c.toLowerCase(c); } if (c>='a'&& c<='z') {
			  System.out.print(c.toUpperCase(c)); charArray2[2*i+1]=c.toUpperCase(c); }
			  
			 }
		System.out.print(charArray2);
	}

}

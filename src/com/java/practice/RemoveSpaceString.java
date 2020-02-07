package com.java.practice;

public class RemoveSpaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="My Name Is Khan"+
						"Suresh and das";
		char[] charArray=str.toCharArray();
		String withoutSpace="";
		for (int i = 0; i < charArray.length; i++) {
			if ((charArray[i] != ' ')  && (charArray[i]!='\t') ) {
				withoutSpace=withoutSpace+charArray[i];
			}
		}
		System.out.println(withoutSpace);
	}

}

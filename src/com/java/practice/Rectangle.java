package com.java.practice;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h=7;
		int w=9;
		for (int i = 0; i < h; i++) {
			System.out.println();
			
			for (int j = 0; j < w; j++) {
				if (i==0||i==h-1||j==0||j==w-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
		}	

	}

}

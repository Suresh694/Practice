package com.java.practice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 100; i++) {
			if (i%2!=0 &&i%3!=0 &&i%5!=0 &&i%7!=0 &&i!=1) {
				System.out.println(i);
			}
		}
	}

}

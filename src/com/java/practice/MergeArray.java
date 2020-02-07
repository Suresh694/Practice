package com.java.practice;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4,5,8};
		int[] b= {7,5,8};
		int a_length=a.length;
		int b_length=b.length;
		int c_length=a_length+b_length;
		int[] c= {c_length};
		int index=0;
			for (int i = 0; i < c_length; i++) {
				for (int j = 0; j < c_length; j++) {
					
					if (j==0) {
						c[j]=a[j];
						System.out.println(c[j]);
						i++;
					}
					else {
					
						c[j+2]=a[j];
						i++;
					}
				}
				
				for (int j = 1; j < b_length; j++) {
					if (j==1) {
						c[j]=b[i];
					}
					else {
						c[j+2]=b[i];
					}
				}
			}
		
		
	}

}

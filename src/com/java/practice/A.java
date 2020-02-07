package com.java.practice;

public class A {
	
	 A() {
		System.out.println("A Constructor");
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		System.out.println("A");
	}
}

class B extends A{
	
	
	 B() {
		System.out.println("B Constructor");
		// TODO Auto-generated constructor stub
	}

	public void print() {
		System.out.println("B");
	}
	
}
class C extends B{
	public C() {
		System.out.println("C");
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		System.out.println("C Normal");
	}
}

class practice{
	public static void main(String []args) {
		A obj=new C();
		obj.print();
	}
}
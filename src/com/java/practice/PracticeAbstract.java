package com.java.practice;

public abstract class PracticeAbstract {
	
	PracticeAbstract obj;
	
	public PracticeAbstract() {
		// TODO Auto-generated constructor stub
	}
	
	abstract void print();
	
	 static void print2() {
		System.out.println("name");
	}

}
 
abstract class PracticeAbstract2{
	abstract void name2();
}

class Child2 extends PracticeAbstract{

	//@Override
	void print() {
		// TODO Auto-generated method stub
		
	}
	
}

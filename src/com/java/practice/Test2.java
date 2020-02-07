package com.java.practice;

public class Test2 {

	public static void main(String[] args) {
		
		System.out.println("1");
		main(1);
		// TODO Auto-generated method stub
		/*
		 * Parent obj= new Parent(); obj.run(); Parent obj2= new Child(); obj2.run();
		 * Child obj3=new Child(); obj3.run(); Object obj4=new Parent();
		 */
	}
	
	public static void main(int a) {
		System.out.println("Override Method");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

}

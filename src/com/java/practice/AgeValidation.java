package com.java.practice;

public class AgeValidation {
	
	/* final */ static void agevalidate(int age) throws MyException {
		if (age < 18) {
			throw new MyException("Age is less than 18");
		}
		else {
			System.out.println("You can vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			/*
			 * AgeValidation obj=new AgeValidation(); obj.agevalidate(15);
			 */
			agevalidate(15); 
		} catch (MyException e) {
			// TODO: handle exception
			System.out.println("Exception Occured: "+e);
		}

	}

}

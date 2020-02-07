package com.java.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.sun.jna.platform.win32.OaIdl.DECIMAL;

public class SameString {
	
	/*
	 * public SameString() { System.out.println("Object"); }
	 */
	
	  public static void main(String args[]) { 
		
		  try {
			Class cls=Class.forName("SameString");
			SameString obj=(SameString)cls.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	  }
	 

	/*
	 * private static void SameString(Object object) { // TODO Auto-generated method
	 * stub System.out.println("Object Implementation"); } private static void
	 * SameString() { System.out.println("String");
	 * 
	 * }
	 */
}

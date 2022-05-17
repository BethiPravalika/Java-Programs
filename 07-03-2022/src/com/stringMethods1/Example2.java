package com.stringMethods1;

public class Example2 {

	public static void main(String[] args) {

		/**
		 * compareTo(String anotherString):
		 * 
		 * Compares two strings lexicographically.
		 * 
		 * =======================================================
		 * 
		 * compareToIgnoreCase(String str):
		 * 
		 * Compares two strings lexicographically, ignoring case differences.
		 * 
		 */		
		
		String text1 = "Srinivas";//S-83
		
		String text2 = "Srinivas 123";
		
		String text3 = "Boy";//G-71
		
		String text4 = "srinivas";//s-115
		
		//System.out.println(text1.compareTo(text2));
		
		//System.out.println(text1.compareTo(text3));//83-71 = 12
		
		System.out.println(text1.compareTo(text4));//83-115 = -32
		
		System.out.println("=======================");
		
		System.out.println(text1.compareToIgnoreCase(text4));//0
		
	}

}

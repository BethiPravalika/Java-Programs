package com.stringMethods2;

public class Example3 {

	public static void main(String[] args) {

		/**
		 * indexOf(String str):
		 * 
		 * Returns the index within this string of the first occurrence of the 
		 * specified substring.
		 * 
		 * =======================================================================
		 * 
		 * indexOf(String str, int fromIndex):
		 * 
		 * Returns the index within this string of the first occurrence of the 
		 * specified substring, starting at the specified index.
		 * 
		 */
		
		String text = "Welcome to India, welcome to Hyderabad.";
		
		System.out.println(text.indexOf("to"));
		
		System.out.println(text.indexOf("to", 10));		

	}

}

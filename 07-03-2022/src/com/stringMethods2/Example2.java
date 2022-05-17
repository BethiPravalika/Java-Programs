package com.stringMethods2;

public class Example2 {

	public static void main(String[] args) {

		

		/**
		 * indexOf(int ch):
		 * 
		 * Returns the index within this string of the first occurrence of the 
		 * specified character.
		 * 
		 * =======================================================================
		 * 
		 * indexOf(int ch, int fromIndex):
		 * 
		 * Returns the index within this string of the first occurrence of the 
		 * specified character, starting the search at the specified index.
		 * 
		 */
		
		String text = "India is a great country";
		
		System.out.println(text.indexOf('a'));
		
		System.out.println(text.indexOf('a', 5));
		
		System.out.println(text.indexOf('a', 10));
		
		

	}

}

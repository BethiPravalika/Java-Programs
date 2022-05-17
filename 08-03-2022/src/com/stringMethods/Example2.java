package com.stringMethods;

public class Example2 {

	public static void main(String[] args) {


		/**
		 * replace(char oldChar, char newChar):
		 * 
		 * Returns a string resulting from replacing all occurrences of 
		 * oldChar in this string with newChar.
		 * 
		 */
		
		String text = "Welcome to Hyderabad, welcome to India.";
		
		System.out.println(text);
		
		System.out.println(text.replace('o', '*'));
	}

}

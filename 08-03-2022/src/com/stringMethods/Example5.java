package com.stringMethods;

public class Example5 {

	public static void main(String[] args) {

		/**
		 * startsWith(String prefix):
		 * 
		 * Tests if this string starts with the specified prefix.
		 */

		String text = "Welcome to Hyderabad, welcome to India.";

		System.out.println(text.startsWith("to"));

		System.out.println(text.startsWith("Welcome"));

		System.out.println(text.startsWith("Welcome to Hyderabad,"));
		
		System.out.println(text.startsWith("welcome to India."));
	}

}

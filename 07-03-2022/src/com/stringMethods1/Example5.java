package com.stringMethods1;

public class Example5 {

	public static void main(String[] args) {
		/**
		 * endsWith(String suffix):
		 * 
		 * Tests if this string ends with the specified suffix.
		 */
		
		String text = "Welcome to String Concept";
		
		System.out.println(text.endsWith("Welcome"));
		
		System.out.println(text.endsWith("Concept"));

		System.out.println(text.endsWith("String Concept"));
		
		System.out.println(text.endsWith("String"));
	}

}

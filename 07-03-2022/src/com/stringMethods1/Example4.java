package com.stringMethods1;

public class Example4 {

	public static void main(String[] args) {


		/**
		 * contains(CharSequence s):
		 * 
		 * Returns true if and only if this string contains the 
		 * specified sequence of char values.
		 * 
		 */
		
		String text = "Pravalika is a good girl";
		
		System.out.println(text.contains("is"));
		System.out.println(text.contains("Is"));
		System.out.println(text.contains("good"));
		
		System.out.println(text.contains("Pravalika"));
	}

}

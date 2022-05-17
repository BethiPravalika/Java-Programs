package com.stringMethods;

public class Example7 {

	public static void main(String[] args) {

		/**
		 * toCharArray():
		 * 
		 * Converts this string to a new character array.
		 */

		String text = "Welcome to Hyderabad";

		char characters[] = text.toCharArray();
		
		for(char character: characters)
		{
			System.out.println(character);
		}
	}

}

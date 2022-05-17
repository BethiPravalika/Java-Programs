package com.stringMethods;

public class Example4 {

	public static void main(String[] args) {

		/**
		 * split(String regex):
		 * 
		 * Splits this string around matches of the given regular expression.
		 * 
		 */
		
		String text = "Welcome to Hyderabad, welcome to India.";
		
		System.out.println(text);
		
		System.out.println("=================");
		
		String words[] = text.split("\\s");
		
		for(String word: words)
		{
			System.out.println(word);
	}

}
}

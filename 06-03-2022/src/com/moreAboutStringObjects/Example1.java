package com.moreAboutStringObjects;

public class Example1 {

	public static void main(String[] args) {
		
		//Literal Objects
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Hai";
		
		System.out.println(s1  ==  s2);
		System.out.println(s1 ==  s3);
		
		System.out.println("==============");
		
		//using new keyword
		
		String s11 = new String("Hello");
		String s12= new String("Hello");
		String s13 = new String("Hello");

		
		System.out.println(s11 ==  s12);
		System.out.println(s11 ==  s13);


		
	}

}

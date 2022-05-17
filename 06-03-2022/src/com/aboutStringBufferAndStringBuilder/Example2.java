package com.aboutStringBufferAndStringBuilder;

public class Example2 {

	public static void main(String[] args) {


		StringBuilder name = new  StringBuilder("Srinu");
		
		System.out.println(name);
		
		System.out.println("=================");
		
		name.append("Pravs");  //adding some value to the existing 
		
		System.out.println(name);
		
		System.out.println("===================");
		
		name.append("  is my best friend.");  //adding some value to name
		
		System.out.println(name);

	}

}

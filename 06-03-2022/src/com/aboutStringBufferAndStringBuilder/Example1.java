package com.aboutStringBufferAndStringBuilder;

public class Example1 {

	public static void main(String[] args) {

		StringBuffer name = new StringBuffer("Neha");
		
		System.out.println(name);
		
		System.out.println("===================");
		
		name.append("Sharma");//adding some value to the
		
		System.out.println(name);
		
		System.out.println("===========");
		
		name.append("is my best friend."); //adding some names
		System.out.println(name);
}

}

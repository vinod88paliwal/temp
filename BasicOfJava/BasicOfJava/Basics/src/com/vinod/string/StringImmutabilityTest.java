package com.vinod.string;

public class StringImmutabilityTest {

	
	public static void main(String[] args) {

		
		String A = "Test";
		String B = "Test";

		B= B.toUpperCase();
		
		System.out.println("A: "+A +" B: "+B);
		
		
	}

}

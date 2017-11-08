package com.vinod.string;

public class ToUpper {

	public static void main(String[] args) {
		
		
		String s1 = "Test";
		
		String s2 = "Test";
		
		System.out.println(s1.hashCode());
		s1 = s1.toUpperCase();
		
		System.out.println(s1.hashCode());
		
		System.out.println(s2);
		
		
	}
	
}

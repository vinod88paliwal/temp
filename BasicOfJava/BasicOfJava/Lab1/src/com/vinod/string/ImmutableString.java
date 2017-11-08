package com.vinod.string;

public class ImmutableString {

	public static void main(String[] args) {
		
		String A = "Test";
		String B = "Test";
		
		
		System.out.println(A+"  ==Before==  "+B);
		System.out.println(A == B);
		
		B = B.toUpperCase();

		System.out.println(A+"  ==After==  "+B);
		System.out.println(A == B);
	}
	
}

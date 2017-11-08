package com.top30.questions;

import java.io.*;
//Write a Java program to find whether a given string is a palindrome
class StringPalindrome {
	
 public static void main(String str[]) throws IOException  {

	 StringPalindrome sp = new StringPalindrome();
	
	 String s = "malayalam";
	 sp.compare(s);

 }
private void compare(String st) throws IOException {
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter the String: ");
	String s = in.readLine(), n = "";
		
	//String n="";
	for (short i = (short) (s.length() - 1); i >= 0; i--) {
		char ch = s.charAt(i);
		n += ch;
	}
	if (s.equalsIgnoreCase(n))
		System.out.print("Palindrome!!!!");
	else
		System.out.print("Not Palindrome!!!!");
	
	
}
                    	// OR
/*private static final boolean isPalindrome(final String str) {
	return str.equals((new StringBuilder(str)).reverse().toString());

	} */

}
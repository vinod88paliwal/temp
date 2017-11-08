package com.vinod.analytical;

import java.io.IOException;

public class ReverseStringExample {

	public static String reverseIteration(String str) {
	        StringBuilder strBuilder = new StringBuilder();
	        char[] strChars = str.toCharArray();

	        for (int i = strChars.length - 1; i >= 0; i--) {
	            strBuilder.append(strChars[i]);
	        }

	        return strBuilder.toString();
	    }
		//Using Recursion
	    public static String reverseRecursively(String str) {

	        //base case to handle one char string and empty string
	        if (str.length() < 2) {
	            return str;
	        }
	        return reverseRecursively(str.substring(1)) + str.charAt(0);

	    }

	     static String reversMethod(String str){
	    	String reverseStr = new StringBuffer(str).reverse().toString();
	    		        
	    	return reverseStr;

	    	}

	    
	    
	    public static void main(String args[]) throws IOException {

	        //original string
	        String str = "Sony is going to introduce Internet TV soon";
	        System.out.println("Original String: " + str);

	        String reverseStr = reversMethod(str);
	        System.out.println("Reverse String using StringBuffer: " + reverseStr);

	        reverseStr = reverseIteration(str);
	        System.out.println("Reverse String using Iteration: " + reverseStr);

	        reverseStr = reverseRecursively("Vinod Paliwal Bangalore");
	        System.out.println("Reverse String using Recursion: " + reverseStr);

	    }

}
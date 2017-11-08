package com.vinod.string;

public class SubStringExample {
//subString concept : Second param - First param 
	
	
	public static void main(String[] args) {
		
/*  String subStringSample = "This subString Example shows how to divide String";
		  //String newString = subStringSample.substring(3);
 
  int len = subStringSample.length();
  System.out.println("Length: "+len);
  String newString = subStringSample.substring(49);
			
		  System.out.println(newString);

		  if(subStringSample.equals(newString)){
			  System.out.println("same object.......");
		  }else{
			  
			  System.out.println("different object.......");
		  }
		  */

		
   String subStringSample = "This is subString Example shows how to divide String";
		  //String newString = subStringSample.substring(3);
 
  int len = subStringSample.length();
  System.out.println("Length: "+len);
  //String newString = subStringSample.substring(1,5);
  //String newString = subStringSample.substring(2,6);
  String newString = subStringSample.substring(49,1);// it will throw  java.lang.StringIndexOutOfBoundsException: String index out of range: -48
 // Second parameter should be gretar or equal to first para if it is equal the it will not return anything
  //
  //String newString = subStringSample.substring(100);
			
		  System.out.println("newString : "+newString);
			  
		  	
		  
		
		
		
	}
	
}

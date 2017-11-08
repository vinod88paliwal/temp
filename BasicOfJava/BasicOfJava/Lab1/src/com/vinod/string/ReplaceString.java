package com.vinod.string;

public class ReplaceString {

	public static void main(String[] args) {
		
  String replaceSample = "This String replace Example shows how to replace one char from String";
  String newString = replaceSample.replace('r', 't');
	
  System.out.println(newString);

  if(replaceSample.equals(newString)){
	  System.out.println("same object.......");
  }else{
	  
	  System.out.println("different object.......");
  }
  
  	}
	
	
}

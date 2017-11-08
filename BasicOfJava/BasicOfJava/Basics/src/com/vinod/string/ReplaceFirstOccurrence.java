package com.vinod.string;

public class ReplaceFirstOccurrence {

	public static void main(String[] args) {

		String replaceSample = "String replace Example with replaceFirst";
		String newString = replaceSample.replaceFirst("re","RE");

		System.out.println(newString);

		  if(replaceSample.equals(newString)){
			  System.out.println("same object.......");
		  }else{
			  
			  System.out.println("different object.......");
		  }
	
	}
	
}

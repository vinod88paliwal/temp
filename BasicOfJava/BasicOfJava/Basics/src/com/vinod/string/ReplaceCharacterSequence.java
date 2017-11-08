package com.vinod.string;

public class ReplaceCharacterSequence {

	public static void main(String[] args) {
		
		String replaceSample = "String replace Example of replacing Character Sequence";
		String newString = replaceSample.replace("re", "RE");

		System.out.println("Old String: "+replaceSample);
		 System.out.println("New String :"+newString);

		  if(replaceSample.equals(newString)){
			  System.out.println("same object.......");
		  }else{
			  
			  System.out.println("different object.......");
		  }
	}
	
}

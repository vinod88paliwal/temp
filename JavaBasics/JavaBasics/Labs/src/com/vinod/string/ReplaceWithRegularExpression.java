package com.vinod.string;

public class ReplaceWithRegularExpression {

public static void main(String[] args) {
	
	String replaceSample = "String replace Example with regular expression";
	String newString = replaceSample.replaceAll("^S","R");

	System.out.println(newString);

	  if(replaceSample.equals(newString)){
		  System.out.println("same object.......");
	  }else{
		  
		  System.out.println("different object.......");
	  }

}
}

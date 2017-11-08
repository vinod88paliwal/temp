package com.vinod.analytical;

import java.util.Scanner;

public class ReverseWordUsingRecursion {

	public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
 
       String word;
       System.out.println("Enter a word: ");
       word = input.next();
 
        System.out.println("The reverse word is: ");
       reverseString(word, word.length());
        System.out.println();
 
    }
	
	 public static void reverseString(String word, int size)
	    {
	       if(size==0)
	       {
	           return;
	       }
	       else
	       {
	    	   //System.out.println("Word: "+word);
	          System.out.print("Char: "+word.charAt(size-1));
	          reverseString(word, size-1);
	       }
	    }
}

package com.vinod.analytical;

/**
 * Simple Java program to find factorial of a number using recursion and iteration.
 * Iteration will use for loop while recursion will call method itself
 */
public class FactorialInJava{

    public static void main(String args[]) {
     
      //finding factorial of a number in Java using recursion - Example
      System.out.println("factorial of 5 using recursion in Java is: " + factorial(4));
     
      //finding factorial of a number in Java using Iteration - Example
       //System.out.println("factorial of 6 using iteration in Java is: " + fact(6));
    }
    /*
     * Java program example to find factorial of a number using recursion
     * @return factorial of number
     */
    public static int factorial(int number){      
        //base case
    	int result;
         if(number ==1)
        	return number;
        
         result = number*factorial(number -1);
         System.out.println("Fact: "+result);
        return result; //is this tail-recursion?
    }
 
    /*
     * Java program example to calculate factorial using while loop or iteration
     * @return factorial of number
     */
 
    public static int fact(int number){
        int result = 1;
        while(number != 0){
            result *= number;
            number--;
        }
     
        return result;
    }    
}

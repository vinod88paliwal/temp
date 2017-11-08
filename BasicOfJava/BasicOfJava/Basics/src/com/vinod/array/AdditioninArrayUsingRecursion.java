package com.vinod.array;

import java.util.Scanner;

public class AdditioninArrayUsingRecursion {

	public static int array( int[] arr, int first, int last)
    {
        if(arr[first] == arr[last])/* must be if(first == last),but try this one too, study the code, it is interesting */
        {
           return arr[first];
        }
        else
        { 
           return arr[first] + array(arr, first+1, last);
        }
    }

	public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the input you want to enter: ");
        int size = input.nextInt();
        int[] numArr = new int[size];
 
        System.out.print("Enter "+ size +" numbers: ");
        for(int i=0; i<numArr.length; i++)
        {
          numArr[i]=input.nextInt();
        }
 
        System.out.print("The sum of the numbers is: "+  array(numArr, 0 , size-1) );
    }
}
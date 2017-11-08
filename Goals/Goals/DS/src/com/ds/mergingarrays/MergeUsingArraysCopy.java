package com.ds.mergingarrays;

public class MergeUsingArraysCopy {

	public static void main(String[] args) {
		
		int arr1[]={3,10,30, 36,5};
		int arr2[]={7,4,6,55,43,33,22,90, 3};
		int result[]=new int[arr1.length+arr2.length];
		System.arraycopy(arr1, 0, result,0,arr1.length);
		System.arraycopy(arr2, 0, result,arr1.length, arr2.length);
// 0 is starting position of arr2 and arr1.length is the starting position in the result. 
//arr2.length is the number of elements to be copied.
		
		for (int j = 0; j < result.length; j++)
			System.out.print(result[j] + " ");
		
	}
	
}

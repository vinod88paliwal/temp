package com.vinod.analytical.ds.sorting;

public class MergeSort {

	public static void main(String[] args) {

		int A [] = new int[10]; 
		
		populateA(A);
		
		System.out.println("Before sorting: ");
		printA(A);

		
		System.out.println("\nAfter sorting: ");
		printA(A);
	}
	
	public static int[] merge_sort (int [] A){
		
	}

	
	public static void printA(int [] A){
		
		for(int i : A){
			
			System.out.print(i+" ");
		}
	}
	
	public static int[] populateA(int [] A){
		
		for(int i=0; i< A.length ;i++){
			A[i] =  (int) (Math.random()*100);
		}
		return A;
	}
}

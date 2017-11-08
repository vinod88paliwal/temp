package com.an.analytical;

public class MissingNumber1 {

	public static void main(String[] args) {
		
		int[] a = { 1, 2, 4, 6, 3,7 };
		int len = a.length;
		int miss = getMissingNumber(a,len);
		System.out.println("Missing Number : "+miss);
	}

	private static int getMissingNumber(int[] a, int n) {
		
		int total = (n+1)*(n+2)/2;
		
		for(int i =0; i<n ;i++)
				total -= a[i];
		
		return total;
	}
	
}

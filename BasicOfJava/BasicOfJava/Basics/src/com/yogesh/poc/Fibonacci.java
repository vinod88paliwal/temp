package com.yogesh.poc;

public class Fibonacci {

	
	public static void main(String[] args) {

			int fabCount = 10;
			int [] feb = new int[fabCount];

			feb[0] = 0;
			feb[1] = 1;
			
			for (int i =2 ; i<fabCount ; i++){
				
				feb[i] = feb[i-1] + feb[i-2]; 
			}
			
			for(int j =0 ; j<fabCount ; j++){
				System.out.print(feb[j] +" ");
			}
	}

}

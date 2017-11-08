package com.vinod.exception;

public class Hello2 {
	void show()
	{
		int[] i = new int[10];
		try {
			
			i[47]=99;
			System.out.println("hello dear");;;;;;;;;;
			System.out.println("hello dear11111");
			
		}catch (ArrayIndexOutOfBoundsException e) {
		i[1]=99;
		System.out.println("ArrayIndexOutOfBoundsException here");
		}
		 catch (Exception e) {
				i[1]=99;
				System.out.println("Exception here");
				}
		 finally{
			 
				System.out.println("finally");
			}
		
		System.out.println("Outside try catch");
	}
	
	public static void main(String[] args) {
		
		Hello2 h = new  Hello2();
		h.show();
		
		
		
	}
	

	
}

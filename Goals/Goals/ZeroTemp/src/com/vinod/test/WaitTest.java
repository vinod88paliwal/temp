package com.vinod.test;

public class WaitTest {

	public static void main(String[] args) {
		
		String str = new String("abcd");
		
		synchronized(str){
		try {
			str.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
	
}

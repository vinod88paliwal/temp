package com.thread.norun;

public class TestThread extends Thread{

	
	//not overriding Thread.run() method.
	
	public static void main(String[] args) {
		
		Thread t = new TestThread();
		t.setName("My Thread");
		
		System.out.println("Before starting thread : "+Thread.currentThread().getName());
		
		t.start();
		
		System.out.println("After starting thread: "+Thread.currentThread().getName());
	}
	
}

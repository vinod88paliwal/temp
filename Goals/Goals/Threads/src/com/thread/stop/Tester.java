package com.thread.stop;

public class Tester {

	public static void main(String[] args) {
	Runner run=	new Runner();
		
		Thread t = new Thread(run);
		t.start();
		
		run.exit(false);
			
	
	}
	
}

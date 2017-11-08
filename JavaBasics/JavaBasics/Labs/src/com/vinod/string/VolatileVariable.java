package com.vinod.string;

public class VolatileVariable {


	private boolean isActive = Thread.currentThread().isAlive();

	public void printMessage(){
	  while(isActive){
	     System.out.println("Thread is Active");
	  }
	} 

	public static void main(String[] args) {
		VolatileVariable obj = new VolatileVariable();
		obj.printMessage();
	}
}

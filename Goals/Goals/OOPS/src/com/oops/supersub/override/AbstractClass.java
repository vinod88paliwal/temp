package com.oops.supersub.override;

public abstract class AbstractClass {

	private int i; // private variable in abstract class is possible
	private AbstractClass()
	{
		System.out.println("private constructor in abstract class is possible");	
	}
	
	private void show()
	{
		System.out.println("private concrete method in abstract class is possible");
	}
	
	//But private abstract method is not possible in abstract class. 
	
//	private abstract void show1();
	
}

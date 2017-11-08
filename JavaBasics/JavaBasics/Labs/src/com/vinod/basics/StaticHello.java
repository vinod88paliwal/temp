package com.vinod.basics;

public class StaticHello {

	static private int i=0;
	static private int j=0;
	
	void show()
	{
	show1(); // can access static method.
	System.out.println("non -static show()");	
	}
	static void show1()
	{
		show2(); // can access static method.
		//show();//can not access non-static method.
	System.out.println("static show1()"+ ++i);	
	}	
	static void show2()
	{
		
	System.out.println("static show2()"+ ++i);	
	}
	public static void main(String[] args) {
	
	StaticHello h = new StaticHello();
	h.show2(); //static method called by object
//	StaticHello.show1();//static method called by class name

	StaticHello h1 = new StaticHello();
	h1.show2();
	
	h.show2();
	h1.show2();
	
	
	
	
	}
}

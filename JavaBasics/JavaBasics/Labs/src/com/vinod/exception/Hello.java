package com.vinod.exception;

public class Hello {

public static void main(String[] args) {
	/*SE obj = new SE();
	obj.show1();
	obj.show();
	*/
	
	SE e1 = new SE();
	e1.show();//sub
	e1.show1();//both but prefer sub
	e1.show2();//sup
	
	System.out.println("--------------");
	
	Emp e = new SE();
	e.show1();//both but prefer sub
	e.show2();//sup
	

}	
	
	
	/*
	void show()
	{
		int[] i = new int[10];
		try {
			
			i[34]=99;
			System.out.println("hello dear");
			System.out.println("hello dear11111");
			
		} catch (Exception e) {
		i[1]=99;
		System.out.println("catch here");
		}
		
		System.out.println("Outside try catch");
	}
	
	public static void main(String[] args) {
		
		Hello h = new  Hello();
		h.show();
		
		
		
	}
	
*/
	

}

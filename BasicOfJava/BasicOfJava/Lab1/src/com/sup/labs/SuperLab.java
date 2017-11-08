package com.sup.labs;

public class SuperLab {

	 int i ;

	 public SuperLab()
	 {
	System.out.println("SuperLab default");	 
	 }
	 
	public SuperLab(int i) {
		System.out.println("SuperLab Parametrized");
		this.i = i;
	}
	 
	void showSuper()
	{
	  System.out.println("showSuper()");
	}
		 
	
	
}

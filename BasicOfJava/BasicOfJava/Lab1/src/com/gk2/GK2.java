package com.gk2;

import com.gk1.GK1;

public class GK2 extends GK1 {

 private int j =10;

 
	public void show(){
		
		System.out.println("show() of GK2 j ==>  "+j);
	}
	
	public static void main(String[] args) {
	/*	
	GK1 o = new GK1();
   o.show();
	
   o = new GK2();
	o.show();*/
   
		GK2 obj = new GK2();
		obj.show();
		obj.show1();
		
		
		
		
		
		
	}
}

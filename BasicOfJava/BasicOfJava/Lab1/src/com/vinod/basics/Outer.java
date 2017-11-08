package com.vinod.basics;

public class Outer {
  private int i=10;
  private void show(){
	  //show1();outer class can ot access inner class methods even public.
	System.out.println("outer");
  }
//inner class
 class Inner{
	 public int j=10;
	 public	void show1(){
 		show(); //inner class method can access outer class methods even private.
 		System.out.println("inner");
 	} 
 }//end of inner class.
 
public static void main(String[] args) {
	Outer out = new Outer();
	out.show(); //outer class object can access only outer class methods 
  //out.show1(); not(inner class method).
	
	Inner in = out.new Inner();
	in.show1(); //inner class object can access only inner class methods
  //in.show(); not(outer class method).
}
}

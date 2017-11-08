package com.vinod.basics;
public class StaticOuter {

	 private int i=10;
	  private void show(){
		  //show1();outer class can`t access inner class methods even public.
		System.out.println("outer");
	  }
	  static private void show2(){
		  //show1();outer class can`t access inner class methods even public.
		System.out.println("outer");
	  }
	//inner class
static class Inner{
		 public int j=10;
		 public	void show1(){
	 		show2(); //static inner class method can access only static methods outer class.
	 		//show(); //not non-static methods. 
	 		System.out.println("inner");
	 	} 
	 }//end of inner class.
	 
	public static void main(String[] args) {
		StaticOuter out = new StaticOuter();
		out.show(); //outer class object can access only outer class methods 
	  //out.show1(); not(inner class method).
		
		StaticOuter.Inner in = new StaticOuter.Inner();
		in.show1(); //inner class object can access only inner class methods
	  //in.show(); not(outer class method).
	}
}

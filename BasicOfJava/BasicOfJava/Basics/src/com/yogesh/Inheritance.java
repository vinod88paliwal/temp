package com.yogesh;

 class A{
	
	 public void m1()
	 {
		 System.out.println(" inside A");
	 }
}
 
 class B extends A{
	 public void m1(){
		 System.out.println("inside B");
	 }
 }

public class Inheritance {

	public static void main(String[] args) {
		
		A a = new A();
		A a1 = new B();
		B b = new B();
		//B b1 = new A();
		a.m1();
		a1.m1();
		b.m1();
		

	}

}

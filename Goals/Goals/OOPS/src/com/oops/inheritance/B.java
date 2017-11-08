package com.oops.inheritance;

import java.util.ArrayList;

public class B extends A {
	
	private void priv()
	{
		System.out.println("B priv()");
	}
	
	public void show(int i){
		System.out.println("show(int i) -- B");
	}
	public void show(int i, int j){
		System.out.println("show(int i, int j) -- B");
	}	
	public int show1(char a){
		System.out.println("show1(char a) -- B");
		return 9;
	}
//static method can`t be overridden
	public static int show2(char a){
		System.out.println("static show2(char a) -- B");
		return 9;
	}
	
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		A a = new A();
				
		a.show(10);
		a.show1('A');
		a.show2('G');
	
		System.out.println("----------BBBBB------------------");
		
		B b = new B();		
		b.show(44);
		b.show(2,3);
		b.show1('B');
		b.show2('H');
		
		System.out.println("----------AABB------------------");
		A ab = new B();
		ab.show(44);
		ab.show1('C');
		ab.show2('E');
	}
}

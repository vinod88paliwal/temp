package com.basics.inheritance;

public class B extends A {

	public void show(int i, int j){
		System.out.println("show(int i, int j) -- B");
	}	
	public int show1(char a){
		System.out.println("show1(char a) -- B");
		return 9;
	}
//static method can`t be overridden
	public static int show2(char a){
		System.out.println("static show2(char a) -- A");
		return 9;
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
		A a1 = new B();
		
		a.show(10);
		a.show1('Á');
		a.show2('G');
		
		System.out.println("----------BBBBB------------------");
				
		b.show(44);
		b.show(2,3);
		b.show1('B');
		b.show2('H');
		
		
		System.out.println("----------CCCCC------------------");
		a1.show(44);
		a1.show1('C');
		

		System.out.println("----------DDDD------------------");
		a1.show(33);
		a1.show1('D');
		a1.show2('E');

		
	}
}

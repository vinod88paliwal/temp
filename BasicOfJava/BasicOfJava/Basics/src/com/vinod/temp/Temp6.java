package com.vinod.temp;

public class Temp6 {
	static String s = "hello";
	public static void main(String[] args) {
	
		System.out.println(s);
		System.out.println(s.hashCode());
		
		show(s);
	}
	static void show(String st){
		
		st = st+"welcome";
		System.out.println(st);
		System.out.println(st.hashCode());
		
		if(s.equals(st)){
			
			System.out.println("same...");
		}
	}
	
}

package com.collectios.basics;

public class EqualsClass {

	public static void main(String[] args) {
        String a = "hello";
        String b = null;
        System.out.println(a.equals(null));
        
        //System.out.println(b.equals(a)); // this will throw NullPointerException.
	}
}

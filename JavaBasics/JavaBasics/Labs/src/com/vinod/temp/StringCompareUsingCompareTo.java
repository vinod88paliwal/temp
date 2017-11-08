package com.vinod.temp;

import java.util.Date;

public class StringCompareUsingCompareTo {

	public static void main(String[] args) {
		
		String s1 = "hello";
		String s2 = "Hello";
		int i =s1.compareTo(s2);
		System.out.println(i);
		if(i==0)
		{
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		Date d = new Date();
		System.out.println("d: "+d);
		
	}
	
}

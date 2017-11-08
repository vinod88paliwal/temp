package com.gk3;

import java.util.ArrayList;
import java.util.List;

public class EqualsLab {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add(new Integer(11));
		l.add(11);
		
		String s ="jsdbvksdj";
		
		Integer i = new Integer(22);
		
		double d = 88.6;
		Double dd = new Double(55.6);
		
		char c='A';
		Character cc  = new Character('A');
		
		
		
		String str =new String( "hello");
		
		if(str.equals(new String("hello")))
		{
			System.out.println("same");
		}else{
			System.out.println("not same");
		}
		
		
		
		if(str.equals("hello"))
		{
			System.out.println("same");
		}else{
			System.out.println("not same");
		}
	}
	
	
	
}

package com.vinod.basics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {
		Set s = new HashSet();
		
		System.out.println(s.add(5));
		System.out.println(s.add(5));
		s.add(2);
		
		Iterator it = s.iterator();
		
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
			
		}
		
		
	}
	
	
	
	
}

package com.collectios.basics;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class HashTableLab {

	public static void main(String[] args) {
		
		Hashtable st = new Hashtable();
		
		st.put("h1", 11);
		
	// it does not allow null neither in key nor in the value.	
//		st.put(null, 33);
		//st.put(44, null);
		
		System.out.println(st);
		
	Enumeration en=	 st.elements();
	
	while (en.hasMoreElements()) {
		
		Object object = (Object) en.nextElement();
		
	}
	
       Vector<String> v = new Vector<String>();

       Enumeration ev=	v.elements();
	
		
	}
	
}

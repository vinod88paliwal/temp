package com.vinod.basics;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

public static void main(String[] args) {
	Map m = new HashMap();
	m.put(1, 100);
	m.put(2,null);
	
	
	System.out.println(m.put(1,33));
	System.out.println(m.put(33,333));
	
	System.out.println(m.values());
}
	

	
	
}

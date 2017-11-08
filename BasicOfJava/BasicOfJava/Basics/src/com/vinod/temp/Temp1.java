package com.vinod.temp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Temp1 {

	
	public static void main(String[] args) {
		
		//Map mp = new ConcurrentHashMap();
		HashMap hm = new HashMap();
		
		hm.put(22,"dfg");
		hm.put(null,22);
		System.out.println(hm);
		
		List l = new ArrayList();
		
		l.add(11); l.add(11); l.add(11);
		
		System.out.println(l);
		
	}
	
}

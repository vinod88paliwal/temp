package com.collectios.basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.NavigationFilter;

public class ListLab {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		
		List l = new ArrayList();
		
		
		
		l.add(10);
		
		System.out.println("add(): "+l.add(50));
		
		l.add(50);
		l.add("GK");
		l.add(33.88);
		l.add(50);
		
		Iterator it =l.iterator();
		
		while(it.hasNext())
		{
		Object o=it.next();
		System.out.println(o);
		}
		
		
		System.out.println(l.get(2));
		
		
		
		System.out.println(l);
		System.out.println(l.get(2));
		
		int i = l.indexOf(100);
		int j = l.indexOf(99);
		System.out.println(i);
		System.out.println(j);
		
		
	}

	
}

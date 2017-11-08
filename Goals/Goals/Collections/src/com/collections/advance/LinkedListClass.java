package com.collections.advance;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class LinkedListClass {
	public static void main(String[] args) {

		LinkedList ls = new LinkedList();
		ls.add("Hello");
		ls.add(1,"bye");
		//System.out.println(ls.get(0));
		
		//System.out.println(ls.get(0));
		
		Iterator it=  ls.iterator();
		//ls.remove(1);  //ConcurrentModificationException at line 29 (it.next())
		
		it.remove(); //java.lang.IllegalStateException, since calling remove() before iterating it.
		
		while (it.hasNext()) {
			
			Object object = (Object) it.next();
			
			System.out.println(object);
			
		}
	}
}
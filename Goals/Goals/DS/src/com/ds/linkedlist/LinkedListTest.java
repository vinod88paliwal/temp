package com.ds.linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add(10); l.add(20); l.add(30); l.add(4);
		
		System.out.println(l);
		System.out.println("Size: "+l.size());
		
		System.out.println("Remove: "+l.remove(2));
		System.out.println("After Remove: "+l);
	}
}

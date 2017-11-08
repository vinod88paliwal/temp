package com.vp.ds.datastructure;

public class LinkedListImpl {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add(5);
		list.add(10);
		list.addFirst(15);
		list.addFirst(20);
		
		System.out.println(list.toString());
	}

}

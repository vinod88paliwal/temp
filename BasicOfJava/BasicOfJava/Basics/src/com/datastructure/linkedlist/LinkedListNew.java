package com.datastructure.linkedlist;

public class LinkedListNew {

	int count; 
	//Node head;
	Node tail;
	
	public LinkedListNew(){
		//head=null;
		tail=null;
	}
	 
	 public void add(Object data)
	 {
		 Node newNode = new Node(data);
		 
		 if (tail == null) {
          //   head = newNode;
             tail = newNode;
             
             count++;
		 } else {

             tail.next = newNode;
             tail = newNode;
             count++;
       }
		 
	 }

	@Override
	public String toString() {
		return "LinkedListNew [ tail=" + tail + "]";
	}
	 
}

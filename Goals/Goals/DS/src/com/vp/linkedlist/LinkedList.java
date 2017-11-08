package com.vp.linkedlist;

public class LinkedList {
	
	private Node header;
	
	public LinkedList() {
		
		this.header = null;
	}

	public void addFirst(int data){
		
		Node node = new Node(data);
		
		if(header ==null){
			header = node;
		
		}else {
			node.setNext(header);
			header = node;
		}
		
	}
	public void add(int data){
		
		Node node = new Node(data);
		
		if(header ==null){
			header = node;
		}else {
				Node currentNode = header;
			
				while(currentNode.getNext() != null) {
					
						currentNode = currentNode.getNext();
				}
				currentNode.setNext(node);
		}
	}
	
	public String toString() {
		
		Node currentNode = header;
		StringBuilder sb = new StringBuilder();
		
		while(currentNode != null) {
				
			sb.append("\t "+currentNode.getData());
			currentNode = currentNode.getNext();
		}
		return sb.toString();
	}
}

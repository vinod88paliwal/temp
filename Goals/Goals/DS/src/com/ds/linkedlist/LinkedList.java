package com.ds.linkedlist;


public class LinkedList {

	private Node head;
	private int count;
	
	public LinkedList() {
		/*this.head = new Node(null);
		this.count = 0;*/
	}
	
	public void add (Object data){
		
		Node tempNode = new Node(data);
		Node currentNode = head;
		
		while(currentNode.getNext() != null){
			
			currentNode = currentNode.getNext();
		}
		
		currentNode.setNext(tempNode);
		count++;
	}
	
	public void add (Object data, int index){
	
		Node tempNode = new Node(data);
		Node currentNode = head;
		
		for(int i=0; i<index && currentNode.getNext() !=null; i++){
			
			currentNode = currentNode.getNext();
		}
		
		currentNode.setNext(tempNode);
		tempNode.setNext(currentNode.getNext());
		count++;
}
	public Object get (int index){
		
		Node currentNode = head;
		
		if(index >= 0 && index <= count )
		{
			for(int i=0; i<=index ; i++)
			{
				currentNode = currentNode.getNext();
	     	}
			return currentNode.getData();
		}
		else{
			return null;
	}
	}
	
	public boolean remove (int index)
	{
		if(index >=0 && index <=count)
		 {
			Node currentNode = head;
			
			for(int i=0; i< index ;i++)
			{
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(currentNode.getNext().getNext());
			count--;
			return true;
		}else{
			return false;
		}
	}
	
	public int size(){
		return count;
	}
	
	public String toString(){
		String output="";
		
		Node currentNode = head.getNext();
		
		while(currentNode !=null){
			
			output += "[ "+currentNode.getData().toString()+" ]";
			
			currentNode = currentNode.getNext();
		}
		return output;
	}
}
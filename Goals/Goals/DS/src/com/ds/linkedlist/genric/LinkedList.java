package com.ds.linkedlist.genric;

public class LinkedList {

	private Node head;
	private int count;
	
	public LinkedList() {
		this.head = new Node();
		this.count = 0;
	}
	
	
	/*public void addFirst (Object data){
		
		Node tempNode = new Node(data);

		tempNode.setNext(head.getNext());
		
		head = tempNode;
		count++;
	}*/
	public void add (Object data){
		
		Node tempNode = new Node(data);
		Node currentNode = head;
		
		while(currentNode.getNext() !=null){
			
			currentNode = currentNode.getNext();
		}
		
		currentNode.setNext(tempNode);
		count++;
	}
	
	public void add (Object data, int index)
	{
		Node tempNode = new Node(data);
		Node currentNode = head;
		
		for(int i=0; i<index && currentNode.getNext() !=null; i++){
			
			currentNode = currentNode.getNext();
		}
		
		tempNode.setNext(currentNode.getNext());
		currentNode.setNext(tempNode);
		count++;
   }
	public Object get (int index){
		
		if(index >= 0 && index <= count )
		{
			Node currentNode = head;		
			for(int i=0; i<=index ; i++){
				currentNode = currentNode.getNext();
			}
		return currentNode.getData();
		}
	else{
		return null;
	}
	}
	
	public boolean remove (int index){
		
		if(index >=0 && index <=count)
		{
			Node currentNode = head;
			
			for(int i=0; i< index; i++)
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
			
			if(currentNode.getData() != null)
			output += "[ "+currentNode.getData().toString()+" ]";
						
			currentNode = currentNode.getNext();
		}
		return output;
	}
	//First Para : How many nodes to be traveled.
	//Second Para : Many nodes to be deleted.
	public void deleteChoice(int noOfTraversal, int noOfNodesToBeDeleted) {

		Node currentNode = head;
		int count = 0, travel = 0;

		while (currentNode != null) {

			count++;
			currentNode = currentNode.getNext();

			if (count == noOfTraversal) {
				count = 0;

				for (int j = 1; j <= noOfNodesToBeDeleted; j++) {

					if (currentNode != null && currentNode.getNext() != null)
						currentNode.setNext(currentNode.getNext().getNext());
				}
			}
		}
	}
	
	
	public void reverse(){
		Node currentNode,prevNode,nextNode ;
		
		currentNode = head;
		prevNode =null;
		
		while(currentNode != null)
		{
			nextNode = currentNode.getNext();
			currentNode.setNext(prevNode);
			prevNode = currentNode;
			currentNode = nextNode;
		}
		head = prevNode;
	}
		
	//Inner class to create Node in list
	class Node {
		private Object data;
		private Node next;
		
		public Node() {}
		
		public Node(Object data) {
			this.data = data;
			this.next = null;
		}
		public Object getData() {
			return data;
		}
		public void setData(Object data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
	}//End of inner Class Node
	
}
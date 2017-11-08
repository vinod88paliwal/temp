package com.vp.ds.datastructure;

public class LinkedList {
	Node header = null;
	
	public void add(int data)
	{
		Node node = new Node(data);
		
		if(header == null)
		{
			header = node;
		}
		else
		{
			Node currentNode = header;
			
			while(currentNode.next != null)
			{
				currentNode = currentNode.next;
			}
			
			currentNode.next = node;
		}
		
	}
	
	public void addFirst(int data)
	{
		Node node = new Node(data);
		if(header == null)
		{
			header = node;
		}
		else
		{
			node.next = header;
			header = node;
		}
		
	}
	
	public String toString(){
		Node currentNode = header;
		StringBuilder sb = new StringBuilder();
		
		while(currentNode != null)
		{
			sb.append("\t" + currentNode.data);	
			currentNode = currentNode.next;
			//sb.append("\t" + currentNode.data);	
	}

		return sb.toString();
}
}

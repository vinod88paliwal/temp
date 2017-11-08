package com.oops.array;

public class RemoveEvenElements {

	public static void main(String[] args) {
		
		  int nodes[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		  
		  int current = 1;
		  int size =  nodes.length;
		  
		    for (int i = 0; i < size-1; i++) {
		        nodes[i] = nodes[current];
		        size--;
		        current = current + 2;
		    }
		    
		
	    for(int i : nodes)
	    {
	    	System.out.println(i);	
	    }
	    
	}
	
	
}

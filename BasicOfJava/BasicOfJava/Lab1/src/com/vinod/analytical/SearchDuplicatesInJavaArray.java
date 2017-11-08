package com.vinod.analytical;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SearchDuplicatesInJavaArray {

	public static void main(String[] args) {
	
		String[] withDuplicates = new String[] {"one","two","three","one"};
		
		String[] withDuplicatesNumbers = new String[] {"1","2","3","2","1"};
		
		Integer[] duplicatesNumbers = {3,2,5,1,2,4,3,2,5};
		
		System.out.println(bruteforceAnyValue(duplicatesNumbers));
		System.out.println(bruteforceAnyValue(withDuplicates));
		System.out.println(bruteforceAnyValue(withDuplicatesNumbers));
		
		//System.out.println(bruteforce(withDuplicates));
		//System.out.println(bruteforce(withDuplicatesNumbers));
 }
	
	
public static Set bruteforceAnyValue(Object[] input)
		{
			Set s = new HashSet();
			
		    for (int i = 0; i < input.length; i++)
		        {
		            for (int j = 0; j < input.length; j++) 
		            {
		                if (input[i].equals(input[j]) && i != j) 
		                {
		                    s.add(input[i]);
		                    
		                    System.out.println("i--> "+i+" j--> "+j);
		                	
		                }
		            }
		        }
		        return s;
}

	
public static Set<String> bruteforce(String[] input)
	{
		Set<String> s = new HashSet<String>();
	    for (int i = 0; i < input.length; i++)
	        {
	            for (int j = 0; j < input.length; j++) 
	            {
	                if (input[i].equals(input[j]) && i != j) 
	                {
	                    s.add(input[i]);
	                    
	                    System.out.println("i--> "+i+" j--> "+j);
	                	
	                }
	            }
	        }
	        return s;
	    }
	  

public static List<String> bruteforceByList(String[] input)
{
	List<String> l = new ArrayList<String>();
		
	    for (int i = 0; i < input.length; i++)
	        {
	            for (int j = 0; j < input.length; j++) 
	            {
	                if (input[i].equals(input[j]) && i != j) 
	                {
	                    l.add(input[i]);
	                    
	                    System.out.println("i--> "+i+" j--> "+j);
	                	
	                }
	            }
	        }
	        return l;
	    }

}

package com.vinod.genrics;

import java.util.ArrayList;
import java.util.*;

public class Lab2 {

	public static void main(String[] args) {
		
		ArrayList<Stocks> stockList = new ArrayList<Stocks>();
	      Stocks sony = new Stocks("Sony","6758.T");
	      stockList.add(sony);
	      Stocks retreivedStock = stockList.get(0); //no cast requires – automatic casting by compiler
	      System.out.println(retreivedStock);
	  
	
	
	    //prior to JDK 7
	      HashMap<String, Set<Integer>> contacts = new HashMap<String, Set<Integer>>();

	      //JDK 7 diamond operator
	      //HashMap<String, Set<Integer>> contactsNew = new HashMap<>();


	}
	
	//type inference in generic method
	public static <K,V> HashMap<K,V> newContacts() {
	   return new HashMap<K,V>();
	}

	
	
	
}

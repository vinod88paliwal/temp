package com.vinod.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
/*		
		//1) Using Arrays.asList() method. 
		String[] asset = {"equity", "stocks", "gold", "foreign exchange","fixed income", "futures", "options"};
		List assetList = Arrays.asList(asset);  
		
		System.out.println(assetList);
	//	assetList.add("Hello"); // it will throw exception
		System.out.println(assetList);
		
   //2) Array to ArrayList by using Collections.addAll method.

	String[] asset1 = {"equity", "stocks", "gold", "foriegn exchange", "fixed income", "futures", "options"}; 
	List assetList1 = new ArrayList();

	Collections.addAll(assetList1, asset1);
	
	System.out.println(assetList1);
		
	assetList1.add("new Hello"); // we can add
	
	System.out.println(assetList1);
	
	assetList1.remove("gold"); // we can remove
	
	System.out.println(assetList1);		
	
	assetList1.set(1,"indian"); //we can update
	
	System.out.println(assetList1);			
	*/	
	//3. 
	
	String[] asset2 = {"equity", "stocks", "gold", "foriegn exchange", "fixed income", "futures", "options"};
	
	ArrayList newAssetList = new ArrayList();
	 newAssetList.addAll(Arrays.asList(asset2));

	 System.out.println("newAssetList of option3: "+newAssetList);
	
	newAssetList.add("new data");
	
	 System.out.println("newAssetList after add: "+newAssetList);
	 
	 newAssetList.remove("stocks");
	
	 System.out.println("newAssetList after remove: "+newAssetList);
	 
	 newAssetList.set(2, "Silver");
	 
	 System.out.println("newAssetList after set: "+newAssetList);
	
	
	
	
	
	
	
	
	
	}
	
	
}

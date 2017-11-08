package com.vinod.basics;

import java.util.StringTokenizer;

public class StringSplit {

	public static void main(String[] args) {
		

/*		String assetClasses = "Gold:Stocks:Fixed Income:Commodity:Interest Rates";
		String[] splits = assetClasses.split(":");

		System.out.println("splits.size: " + splits.length);

		for(String asset: splits){
		System.out.println(asset);
		}
*/		

		String assetClasses = "Gold:Stocks:Fixed Income:Commodity:Interest Rates";
	
		StringTokenizer stringtokenizer = new StringTokenizer(assetClasses, ":");
		while (stringtokenizer.hasMoreElements()) {
		System.out.println(stringtokenizer.nextToken());
		}
	
	
	
	
	
	
	
	
	
	
	
	}
	
}

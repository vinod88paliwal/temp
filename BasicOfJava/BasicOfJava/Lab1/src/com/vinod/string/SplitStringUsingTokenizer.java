package com.vinod.string;

import java.util.StringTokenizer;

public class SplitStringUsingTokenizer {

	public static void main(String[] args) {
		
		//string split example StringTokenizer
		String assetClasses = "Gold:Stocks:Fixed Income:Commodity:Interest Rates";
		
		StringTokenizer stringtokenizer = new StringTokenizer(assetClasses, ":");
		while (stringtokenizer.hasMoreElements()) {
		System.out.println(stringtokenizer.nextToken());
		}

		
	}
	
}

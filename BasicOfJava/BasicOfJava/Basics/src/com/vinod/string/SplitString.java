package com.vinod.string;

public class SplitString {
	public static void main(String[] args) {

		//split string example
/*		String assetClasses = "Gold:Stocks:Fixed Income:Commodity:Interest Rates";
		String[] splits = assetClasses.split(":");

	 	System.out.println("splits.size: " + splits.length);

		for(String asset: splits){
		System.out.println(asset);
		}
*/
		//-------------------------------
		
		//string split on special character "|"
     String assetTrading = "Gold Trading|Stocks Trading|Fixed Income Trading|Commodity Trading|FX trading";
     //String[] splits = assetTrading.split("\\|");  // two \\ is required because "\" itself require escaping
     String[] splits = assetTrading.split("\\|");
		for(String trading: splits){
		System.out.println(trading);
		}

       //-------------------------------------
		
		// split string on "."
/*		String smartPhones = "Apple IPhone.HTC Evo3D.Nokia N9.LG Optimus.Sony Xperia.Samsung Charge";
		String[] smartPhonesSplits = smartPhones.split("\\.");
		for(String smartPhone: smartPhonesSplits){
		System.out.println(smartPhone);
		}
*/
		//---------------------------------------
		//string split example with limit

		String places = "London.Switzerland.Europe.Australia";
		String[] placeSplits = places.split("\\.",2);

		System.out.println("placeSplits.size: " + placeSplits.length );

		for(String contents: placeSplits){
		System.out.println(contents);
		}

		
	
		
	}
}

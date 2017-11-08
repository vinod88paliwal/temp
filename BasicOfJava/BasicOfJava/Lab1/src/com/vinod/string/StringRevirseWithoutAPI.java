package com.vinod.string;

public class StringRevirseWithoutAPI {

	public static void main(String[] args) {
		
		String str = "welcome vinod";
		StringBuffer sb = new StringBuffer();
		
		//String arr[] = str.split(" ");
		
		System.out.println("");
		String newString="";
		
		for(int i = str.length()-1; i>=0; i--){
			
			System.out.print(str.charAt(i));
			//or
			sb.append(str.charAt(i));
			
		}
		System.out.println("  "+sb);
		
	}
	
}

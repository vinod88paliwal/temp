package com.vinod.string;

public class StringRevirse {

	public static void main(String[] args) {
		
	
		String s = "welcome Vinod";
		
		System.out.println("Length of String: "+s.length());
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = s.length() -1; i >=0 ; --i) {
			
			sb.append(s.charAt(i));
			
		}
		
		System.out.println(sb.toString());
		
		
	}
	
	
	
}

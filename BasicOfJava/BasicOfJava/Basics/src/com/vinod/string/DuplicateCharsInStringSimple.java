package com.vinod.string;
import java.util.*;
public class DuplicateCharsInStringSimple {
	public static void main(String[] args) {
		String str = "Java2Neovioioioce";
		ArrayList<Character> dupChars = new ArrayList<Character>();
		
		for (int i = 0; i < str.length()-1; i++) 
		{
			int count = 0;
			if (!dupChars.contains(str.charAt(i))) 
			{
				for (int j = 0; j < str.length(); j++) 
				{
					if (str.charAt(i) == str.charAt(j)) 
					{
						count++;
					}
				}//Inner loop end				    
			}
				if (count > 1){ 
					System.out.println(str.charAt(i) + " --- " + (count));
					dupChars.add(str.charAt(i));
		        	 }
		}//Outer loop end
	}
}
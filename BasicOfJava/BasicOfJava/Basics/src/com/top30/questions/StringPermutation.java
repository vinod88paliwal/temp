package com.top30.questions;
import java.util.*;

public class StringPermutation {
	
	 public static  void main(String[] args) {
	        String s = "abc";
	    ArrayList<String> value = PermutationFinder(s);
	    System.out.println("\nThe Permutations are : \n" + value);
	    }
	
	 public static String charinsert(String str, char c, int j) {
		    String begin = str.substring(0, j);
		    String end = str.substring(j);
		    return begin + c + end;
		    }
	
	public static ArrayList<String> PermutationFinder(String s) {
		ArrayList<String> perm = new ArrayList<String>();
		if (s == null) { // error case
			return null;
		} else if (s.length() == 0) {
			perm.add(""); // initial
			return perm;
		}
		char initial = s.charAt(0); // first character
		String rem = s.substring(1); // Full string without first character
		ArrayList<String> words = PermutationFinder(rem);
		for (String str : words) {
			for (int i = 0; i <= str.length(); i++) {
				perm.add(charinsert(str, initial, i));
			}
		}
		return perm;
	}
    
    
   
}
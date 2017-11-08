package com.vinod.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {

	public static void main(String a[]) {
		DuplicateCharsInString dcs = new DuplicateCharsInString();
		dcs.findDuplicateChars("Java2Nifddaoveice with this program");
	}
	
	public void findDuplicateChars(String str) {

		Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
		//char[] chrs = str.toCharArray();
		//for (Character ch : chrs) {
					//or
			for(int i=0; i<str.length(); i++){
				char ch = str.charAt(i);
				
			if(ch != 32){ // Removing space count
			if (dupMap.containsKey(ch)) {
				dupMap.put(ch, dupMap.get(ch) + 1);
			} else {
				dupMap.put(ch, 1);
			}
			}
		}
		Set<Character> keys = dupMap.keySet();
		for (Character ch : keys) {
				//or
		//for (char ch : keys) {	
			if (dupMap.get(ch) > 1) {
				System.out.println(ch + "--->" + dupMap.get(ch));
			}
		}
	}

}

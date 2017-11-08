package com.an.analytical;

import java.util.*;
public class Duplicate {

	public static void main(String a[]) {
		Duplicate dup = new Duplicate();

		String str = "Java2Nifddaoveice with this program";
		int arr[] = {3,2,5,3,7,8,4,8,3,4,5,6};
		
		dup.duplicateCharsInString(str);
		//dup.duplicateNosInArray(arr);
		
					//OR
		
		dup.duplicateCharsInString1(str);
		//dup.duplicateNosInArray1(arr);
	}
	
	public void duplicateCharsInString(String str) {
		
		long start = System.currentTimeMillis( );
		
		char[] chrs = str.toCharArray();
		
		Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
		
		for (Character ch : chrs) {
					
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
			
			int count = dupMap.get(ch);
			
			//if (count > 1) {
			//System.out.println(ch+"--> "+count);
		//	}
		}
		long end = System.currentTimeMillis( );
        long diff = end - start;
        System.out.println("Difference is : " + diff);
	}
	
	public void duplicateNosInArray(int[] arr) {

		Map<Integer, Integer> dupMap = new HashMap<Integer, Integer>();

		for(int i=0; i<arr.length; i++)
		 {
			int no = arr[i];
				
			if (dupMap.containsKey(no)) {
				dupMap.put(no, dupMap.get(no) + 1);
			} else {
				dupMap.put(no, 1);
			}
			}
		Set<Integer> keys = dupMap.keySet();
		for (Integer ch : keys) {
				//or
		//for (char ch : keys) {
			
			int count = dupMap.get(ch);
			
			//if (count > 1) {
				System.out.println(ch + "--->" + count);
		//	}
		}
	}
					//OR
	
 void duplicateCharsInString1(String str) {
	 long start = System.currentTimeMillis( );
	 
		List<Character> dupChars = new ArrayList<Character>();
		
		for (int i = 0; i < str.length() - 1; i++) {
			int count = 0; char ch =' ';
			if (!dupChars.contains(str.charAt(i)) && str.charAt(i) != 32) {
				for (int j = 0; j < str.length()-1; j++) {
					if (str.charAt(i) == str.charAt(j)) {
						count++;
					}
				}// Inner loop end
				ch = str.charAt(i);
			}
			if (count > 1) {
				System.out.println(ch + " --- " + (count));
				dupChars.add(ch);
			}
		}// Outer loop end
		long end = System.currentTimeMillis( );
        long diff = end - start;
        System.out.println("Difference111 is : " + diff);	
	}
	
	void duplicateNosInArray1(int[] arr) {
		
		ArrayList<Integer> dupChars = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length - 1; i++) {
			int count = 0;
			if (!dupChars.contains(arr[i])) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
					}
				}// Inner loop end
			}
			if (count > 1) {
				System.out.println(arr[i] + " --- " + (count));
				dupChars.add(arr[i]);
			}
		}// Outer loop end
		
	}
	
}

package com.addi;

import java.util.*;
import java.util.Map.*;

public class CompareIt {

	public static void main(String[] args) {
		
		Set<Entry<String, Integer>> set = userScore.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
		{
		public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
		{
		return (o2.getValue()).compareTo( o1.getValue() );
		}
		} );
		int count = 0;
		Map<String, Integer> topUserScore = new HashMap<String, Integer>();
		for(Map.Entry<String, Integer> entry:list){
		//find first 10 similar inclined userIds
		if (count < 100){
		topUserScore.put(entry.getKey(), entry.getValue());
		count = count + 1;
		}
		}
	}
	
}

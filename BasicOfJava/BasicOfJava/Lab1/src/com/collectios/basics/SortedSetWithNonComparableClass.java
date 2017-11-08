package com.collectios.basics;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetWithNonComparableClass {

	public static void main(String[] args) {
		
		SortedSet ss = new TreeSet();
		
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		Emp e3 = new Emp();
		
		ss.add(e1); ss.add(e2); ss.add(e3);
		
		System.out.println(ss);
	}
	
	
}

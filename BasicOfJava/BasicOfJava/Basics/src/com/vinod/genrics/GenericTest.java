package com.vinod.genrics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class GenericTest {

	public static void main(String[] args) {

		//Case1
		Set setOfRawType = new HashSet<String>();
		setOfRawType = new HashSet<Integer>();
		
		//Case2		
		Set<Object> setOfAnyType = new HashSet<Object>(); //legal
	 // Set<Object> setOfAnyType1 = new HashSet<String>(); // compiler error -
	//	HashSet<Object> setOfAnyType2 = new HashSet<String>(); // compiler error -
		
		setOfAnyType.add("abc"); //legal
		setOfAnyType.add(new Float(3.0f)); //legal - <Object> can accept any type

		//Set<Object> SetOfObject = new HashSet<String>(); //compiler error - incompatible type
		
		//Case3
		Set<?> setOfUnknownType = new LinkedHashSet<String>();
		setOfUnknownType = new LinkedHashSet<Integer>();

		//Case4
		Set<String> setOfString = new HashSet<String>(); //valid in Generics
		setOfString = new LinkedHashSet<String>(); // Ok

		//Case5
		Set<? extends Number> setOfAllSubTypeOfNumber = new HashSet<Integer>(); //legal - Integer extends Number
		setOfAllSubTypeOfNumber = new HashSet<Float>(); //legal - because Float extends Number

		//Case6
		Set<? super TreeMap> setOfAllSuperTypeOfTreeMap = new LinkedHashSet<TreeMap>(); //legal because TreeMap is superType of itself
		setOfAllSuperTypeOfTreeMap = new HashSet<SortedMap>(); //legal because SorteMap is super class of TreeMap
		setOfAllSuperTypeOfTreeMap = new LinkedHashSet<Map>(); //legal since Map is super type of TreeMap
		
		//Case7
		List.class; //legal
		List<String>.class  //illegal
	}
	
	//Case8
	 public static <T> T identical(T source){

		 return source;
	 }

	
}

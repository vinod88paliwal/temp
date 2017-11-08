package com.vinod.basics;

import java.util.Arrays;
public class SortFruitObject {
	
public static void main(String args[]){
		 
		Fruit[] fruits = new Fruit[4];
 
		Fruit pineappale = new Fruit("Pineapple");
		Fruit apple = new Fruit("Apple"); 
		Fruit orange = new Fruit("Orange"); 
		Fruit banana = new Fruit("Banana"); 
 
		fruits[0]=pineappale;
		fruits[1]=apple;
		fruits[2]=orange;
		fruits[3]=banana;
 
		Arrays.sort(fruits);
 
		int i=0;
		for(Fruit temp: fruits){
		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() );
		}
	}	
}
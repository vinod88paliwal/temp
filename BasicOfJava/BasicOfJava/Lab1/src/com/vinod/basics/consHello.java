package com.vinod.basics;

public class consHello {

	private int gkTotal ;
	/*consHello(){
		System.out.println("default");
		gkTotal =1000;
	}*/
	
	consHello(int i,int j){
		System.out.println("parametrized");
	}
	
	public static void main(String[] args) {
	
		//consHello obj = new consHello();
		consHello obj = new consHello(22,10);
	}
	
}

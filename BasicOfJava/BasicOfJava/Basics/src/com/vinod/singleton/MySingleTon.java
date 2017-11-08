package com.vinod.singleton;

public class MySingleTon {

	private static MySingleTon mySingleTonObj;
	
	private MySingleTon(){
		System.out.println("inside MySingleTon Constructor ..");
		
	}
	
	public static MySingleTon getInstance(){
		if(mySingleTonObj==null){
			System.out.println("inside if");
			mySingleTonObj = new MySingleTon();
		}
		return mySingleTonObj;
	}
	
	public void getSomething(){
		System.out.println("I am here ...");
	}
	
	public static void main(String[] args) {

		MySingleTon myST = MySingleTon.getInstance();
		myST.getSomething();

	}

}

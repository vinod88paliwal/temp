package com.vinod.singleton;

public class Singleton {
	
	public static Singleton _INSTANCE = new Singleton();
	
	private Singleton() throws Exception{
		throw new Exception();
	}
	
	//Double checked locking should only be used when you have requirement for lazy initialization
	public static Singleton getInstance(){
	     if(_INSTANCE == null){
	         synchronized(Singleton.class){
	         //double checked locking - because second check of Singleton instance with lock
	                if(_INSTANCE == null){
	                    try {
							_INSTANCE = new Singleton();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	                }
	            }
	         }
	     return _INSTANCE;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
		//return super.clone();
	}
	
	
	void show(){
		System.out.println("Singleton- show()");
	}
	
}

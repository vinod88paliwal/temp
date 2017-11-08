package com.dp.singleton1;

import java.lang.reflect.Constructor;
public class ReflectionSingletonTest {
 
   /* public static void main(String[] args) {
	
        SingletonForSingleThread instanceOne = SingletonForSingleThread.getInstance();
        SingletonForSingleThread instanceTwo = null;
    
    try {
            Constructor[] constructors = SingletonForSingleThread.class.getDeclaredConstructors();

            for (Constructor constructor : constructors) 
			{
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (SingletonForSingleThread) constructor.newInstance();
                break;
                       
                				//or
    	Constructor constructor = SingletonForSingleThread.class.getDeclaredConstructor();
    	constructor.setAccessible(true);
    	instanceTwo = (SingletonForSingleThread) constructor.newInstance();

    	} catch (Exception e) {
            e.printStackTrace();
        }

    	System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
}*/
	
	 public static void main(String[] args) {
			
	        SingletonForSingleThread instanceOne = SingletonForSingleThread.getInstance();
	        SingletonForSingleThread instanceTwo = null;
	    
	    try {
	            /*Constructor[] constructors = SingletonForSingleThread.class.getDeclaredConstructors();

	            for (Constructor constructor : constructors) 
				{
	                //Below code will destroy the singleton pattern
	                constructor.setAccessible(true);
	                instanceTwo = (SingletonForSingleThread) constructor.newInstance();
	                break;
	*/                       
	                				//or
	    	Constructor constructor = SingletonForSingleThread.class.getDeclaredConstructor();
	    	constructor.setAccessible(true);
	    	instanceTwo = (SingletonForSingleThread) constructor.newInstance();
	    	System.out.println("Instance got created !!!");

	    	} catch (Exception e) {
	            e.printStackTrace();
	        }

	    	if(instanceTwo !=null)
	    	{
	    		instanceTwo.Hello();
	    	}
	    //	System.out.println(instanceOne.hashCode());
	        //System.out.println(instanceTwo.hashCode());
	}
}

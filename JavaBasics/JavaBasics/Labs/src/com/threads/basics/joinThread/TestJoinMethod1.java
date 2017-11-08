package com.threads.basics.joinThread;

class TestJoinMethod1 extends Thread{  
    public void run(){  
     for(int i=1;i<=5;i++){  
      try{
    	  System.out.println(Thread.currentThread().getName()+" -- "+i);
       Thread.sleep(500);  
      }catch(Exception e){System.out.println(e);}  
   //  System.out.println(i);  
     }  
    }  
   public static void main(String args[]){  
	   Thread t1=new TestJoinMethod1();  t1.setName("Thread t1");
	   Thread t2=new TestJoinMethod1();  t2.setName("Thread t2");
	   Thread t3=new TestJoinMethod1();  t3.setName("Thread t3");
    t1.start();  
    try{  
     t1.join();  
    }catch(Exception e){System.out.println(e);}  
     
    t2.start();  
    t3.start();  
    
   }  
 }  
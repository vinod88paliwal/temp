package com.threads.basics;

//implementing Thread by implementing Runnable interface

public class MyRunnable implements Runnable{        

    public void run(){
       System.out.println("Thread Running " + Thread.currentThread().getName());
    }

 }

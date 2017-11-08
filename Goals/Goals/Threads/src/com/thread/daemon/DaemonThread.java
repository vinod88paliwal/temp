package com.thread.daemon;

class DaemonThread implements Runnable{
	 
    @Override
    public void run() {
        while(true){
            processSomething();
        }
    }
 
    private void processSomething() {
        try {
            System.out.println("Processing daemon thread : "+Thread.currentThread().getName());
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
     
}

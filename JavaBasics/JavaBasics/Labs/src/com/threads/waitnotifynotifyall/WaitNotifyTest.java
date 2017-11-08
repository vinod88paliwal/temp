package com.threads.waitnotifynotifyall;

public class WaitNotifyTest {
	 
    public static void main(String[] args) {
        Message msg = new Message("process it");
        Waiter waiter = new Waiter(msg);
        new Thread(waiter,"waiter").start();
         
        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "waiter1").start();
         
        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "notifier").start();
        System.out.println("All the threads are started");
    }
 
}
//When we will invoke the above program, we will see below output but program will not complete because there are two threads waiting on Message object and notify() method has wake up only one of them, the other thread is still waiting to get notified.
//notify()
/*waiter waiting to get notified at time:1356318734009
waiter1 waiting to get notified at time:1356318734010
All the threads are started
notifier started
waiter waiter thread got notified at time:1356318735011
waiter processed: notifier Notifier work done*/

//or

//If we comment the notify() call and uncomment the notifyAll() call in Notifier class, below will be the output produced.
//notifyAll()

/*waiter waiting to get notified at time:1356318917118
waiter1 waiting to get notified at time:1356318917118
All the threads are started
notifier started
waiter1 waiter thread got notified at time:1356318918120
waiter1 processed: notifier Notifier work done
waiter waiter thread got notified at time:1356318918120
waiter processed: notifier Notifier work done*/

//Since notifyAll() method wake up both the Waiter threads and program completes and terminates after execution.






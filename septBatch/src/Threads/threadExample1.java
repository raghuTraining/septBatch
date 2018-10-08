package Threads;

public class threadExample1 extends Thread{
	
	public static void main(String[] args) {
		  

		myThread t = new myThread();
		
		Thread t1 = new Thread(t,"aaa");
		Thread t2 = new Thread(t, "BBB");


t1.setPriority(Thread.MIN_PRIORITY);
t2.setPriority(Thread.MAX_PRIORITY);
t1.start();
t2.start();
	}


}

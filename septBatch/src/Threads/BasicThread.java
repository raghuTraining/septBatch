package Threads;

public class BasicThread extends Thread {
	
	public void run() {
		
		
		System.out.println("thread1");
	}
	
	
	

	public static void main(String[] args) {

		
		BasicThread t1 = new BasicThread();
		BasicThread t2 = new BasicThread();

		t1.start();
		t2.start();
	}

}

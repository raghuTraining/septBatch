package Threads;

public class sleepMethod extends Thread {

		 public void run(){  
		  for(int i=100;i<105;i++){  
		    try {
				Thread.sleep(5000);
			} 
		    
		    catch (InterruptedException e) {
				e.printStackTrace();
			}
		    
		    System.out.println(i);  
		  }  
		 }  
		 public static void main(String args[]){  
			 sleepMethod t1=new sleepMethod();  
			 sleepMethod t2=new sleepMethod();  
		   
		  t1.start();  
		  t2.start();  
		 }  
		}  

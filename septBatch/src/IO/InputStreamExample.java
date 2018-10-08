package IO;

import java.io.*;  
public class InputStreamExample {    
 /* public static void main(String args[])throws Exception{    
   FileInputStream input1=new FileInputStream("C:/Users/Sudha/Desktop/IO.txt");    
   FileInputStream input2=new FileInputStream("C:/Users/Sudha/Desktop/iooo.txt");    
   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
   int j;    
   while((j=inst.read())!=-1){    
    System.out.print((char)j);    
   }    
   inst.close();    
   input1.close();    
   input2.close();    
  } */   
	public static void main(String args[])throws Exception{  
	  FileInputStream fin1=new FileInputStream("C:/Users/Sudha/Desktop/IO.txt");    
	   FileInputStream fin2=new FileInputStream("C:/Users/Sudha/Desktop/iooo.txt");    
	   FileOutputStream fout=new FileOutputStream("C:/Users/Sudha/Desktop/ouput.txt");      
	   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);    
	   int i;    
	   while((i=sis.read())!=-1)    
	   {    
	     fout.write(i);        
	   }    
	   sis.close();    
	   fout.close();      
	   fin1.close();      
	   fin2.close();       
	   System.out.println("Success..");  
	  }    
}  

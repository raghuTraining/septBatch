package IO;

import java.io.FileOutputStream;

public class fileOutputStream {

	public static void main(String args[]){    
        try{    
          FileOutputStream fout=new FileOutputStream("C:/Users/Sudha/Desktop/IO.txt");    
          fout.write(65);    
          fout.close();    
          System.out.println("success...");    
         }catch(Exception e){System.out.println(e);}    
   }  
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String args[]){    
        try{    
          FileOutputStream fout=new FileOutputStream("C:/Users/Sudha/Desktop/IO.txt");    
          String s=" programming skills";    
          byte b[]=s.getBytes();//converting string into byte array    
          fout.write(b);    
          fout.close();    
          System.out.println("success...");    
         }catch(Exception e){
        	 System.out.println(e);
        	 }    
   }  */  
}

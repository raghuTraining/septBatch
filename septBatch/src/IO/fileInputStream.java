package IO;

import java.io.FileInputStream;

public class fileInputStream {

	
	/* public static void main(String args[]){    
         try{    
           FileInputStream fis=new FileInputStream("C:/Users/Sudha/Desktop/IO.txt");    
           int i = fis.read();  
           System.out.print((char)i);    
 
           fis.close();    
         }catch(Exception e){
        	 
        	 System.out.println(e);}    
        }  	 */
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 public static void main(String args[]){    
         try{    
           FileInputStream fin=new FileInputStream("C:/Users/Sudha/Desktop/IO.txt");    
           int i=0;    
           while((i=fin.read())!=-1){    
            System.out.print((char)i);    
           }    
           fin.close();    
         }catch(Exception e){System.out.println(e);}    
        }    
}

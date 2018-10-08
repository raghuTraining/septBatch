package IO;

import java.io.FileReader;

public class fileReader {

public static void main(String[] args) {
		
		try {
			
			FileReader fr = new FileReader("C:/Users/Sudha/Desktop/iooo.txt");
			
			int i;
			
		    while((i=fr.read())!=-1)  
			System.out.print((char)i);
	fr.close();}
		
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
	
}}

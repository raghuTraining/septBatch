package IO;

import java.io.FileWriter;

public class fileWriter {
	
	public static void main(String[] args) {
		
		try {
			
			FileWriter fw = new FileWriter("C:/Users/Sudha/Desktop/iooo.txt");
			
			fw.write("hello");
			fw.close();
		}
		
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
	}
	

}

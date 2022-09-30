package upr_6;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter{
	
	public static void main(String[] args) {
		//File file = new File("numbers.txt");
		FileWriter writer=null;
		try {
			writer = new FileWriter("numbers.txt");
			for(int i=0; i<10;i++) {
				writer.write(i+"");
				writer.write("\n");
			}
			writer.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					System.out.println("Something went wrong:"+e.getMessage());
				}
			}
				
		}
		
	}
	
}
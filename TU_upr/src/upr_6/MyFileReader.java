package upr_6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

	public static void main(String[] args) {
		
		try (FileReader reader = new FileReader("numbers.txt")){
			
			int symbol;
			try {
				symbol = reader.read();
				while(symbol!=-1) {
					System.out.print((char)symbol);
					symbol = reader.read();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}

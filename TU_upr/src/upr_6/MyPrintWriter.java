package upr_6;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MyPrintWriter {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter("numbers3.txt");
		for(int i=0; i<10;i++) {
			writer.println(i);
		}
		writer.flush();
		writer.close();
	}

}

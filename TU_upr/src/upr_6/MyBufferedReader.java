package upr_6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReader {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("numbers2.txt"));
		String line = reader.readLine();
		while(line!=null) {
			System.out.println(line);
			line = reader.readLine();
		}
		reader.close();
	}

}

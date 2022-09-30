package upr_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyScanner {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("numbers3.txt");
		Scanner reader = new Scanner(file);//"numbers.txt"
		while(reader.hasNextLine()) {
			String line = reader.nextLine();
			System.out.println(line);
		}
		reader.close();
	}

}

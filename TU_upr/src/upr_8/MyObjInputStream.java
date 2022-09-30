package upr_8;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MyObjInputStream {

	public static void main(String[] args) throws IOException {
		File file = new File("nums.bin");
		FileInputStream helpReader = new FileInputStream(file);
		ObjectInputStream reader = new ObjectInputStream(helpReader);
		int count = reader.readInt();
		for(int i=0; i<count;i++) {
			System.out.println(reader.readInt());
			//public class Product implements Serializable{...}
			//System.out.println((Product)reader.readObject());
		}
		reader.close();
		helpReader.close();

	}

}

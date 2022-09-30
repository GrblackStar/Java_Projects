package upr_8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MyObjOutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream helpWriter = new FileOutputStream("nums.bin");
		ObjectOutputStream writer = new ObjectOutputStream(helpWriter);
		writer.writeInt(10);
		for(int i=0; i<10;i++) {
			writer.writeInt(i);
			//public class Product implements Serializable{...}
			//writer.writeInt(product);
		}
		writer.flush();
		writer.close();
		helpWriter.close();
	}

}

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class Demo {

	public static void main(String[] args) {
		Products p1 = new Products("name1", 15);
		Products p2 = new Products("name2", 20);
		Products p3 = new Products("name3", 25);

		try (BufferedWriter writer = new BufferedWriter (new FileWriter("ProductInfo.txt"))) {
			writer.write (p1.getName());
			writer.write ("  ->  " + p1.getPrice() + "" + "\n");
			
			writer.write (p2.getName());
			writer.write ("  ->  " + p2.getPrice() + "" + "\n");
			
			writer.write (p3.getName());
			writer.write ("  ->  " + p3.getPrice() + "" + "\n");
			
			
			File file = new File("ProductInfo.txt");
			if (file.length() == 0) {
				System.out.println("objects were written successfully to file: ProductInfo");}
			else { 
				System.out.println("file is empty");}
			
			
			writer.flush();
			writer.close();
		} catch(IOException e) {
			System.out.println("something went wrong" + e.getMessage());
		} 
		
		
	}

}

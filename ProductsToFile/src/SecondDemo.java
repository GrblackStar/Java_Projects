import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class SecondDemo {

	public static void main(String[] args) {
		Products p1 = new Products("name1", 15);
		Products p2 = new Products("name2", 20);
		Products p3 = new Products("name3", 25);
		
		Products[] allproducts = new Products[3];
		allproducts[0] = p1;
		allproducts[1] = p2;
		allproducts[2] = p3;
		
		try (BufferedWriter writer = new BufferedWriter (new FileWriter("ProductInfo.txt"))) {
			for(Products product : allproducts) {
				writer.write (product.getName());
				writer.write ("  ->  " + product.getPrice() + "");
				writer.newLine();
			}
			System.out.print("objects were written successfully to file: ProductInfo");
			writer.flush();
			writer.close();
		}catch(FileNotFoundException e) {
			System.out.println("something went wrong" + e.getMessage());
		}catch(IOException e) {
			System.out.println("something went wrong" + e.getMessage());
		}
	}

}

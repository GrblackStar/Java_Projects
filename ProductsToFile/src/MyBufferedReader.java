import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReader {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("ProductInfo.txt"))) {
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("something went wrong" + e.getMessage());
		} catch (IOException e) {
			System.out.println("something went wrong" + e.getMessage());
		}

	}

}

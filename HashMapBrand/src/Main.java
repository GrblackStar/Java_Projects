import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 Map<Key, HashProduct> map = new HashMap<Key, HashProduct>();
		 
		 System.out.print("Enter how many products to be added:  ");
		 //nextInt() doesn't read to the end of the line
		 int adding = s.nextInt();
		 //so we need nextLine() -> reads the end of the line
		 s.nextLine();
		 addingProduct(map, adding, s );
		 System.out.println (map);
		 
		 deletingProduct(map, s );
		 System.out.println (map);
		 
		 changePrice(map, s );
		 System.out.println (map);
		 
		 printingMap(map);
		 

		 s.close();
	}
	
	
	public static void addingProduct(Map<Key, HashProduct> map, int adding, Scanner s ) {
		String brand;
		String model;
		int price;
		//i -> the number under which is added
		for (int i=1; i <= adding; i++) {
			 System.out.print("Enter brand: ");
			 brand = s.nextLine();
			 
			 System.out.print("Enter model: ");
			 model = s.nextLine();
			 System.out.print("Enter price: ");
			 price = s.nextInt();
			 s.nextLine();
			 Key key = new Key(brand, model);
			 HashProduct product = new HashProduct(key, price);
			map.put(key, product);
		}
	}
	
	public static void deletingProduct(Map<Key, HashProduct> map, Scanner s) {
		 System.out.println("You are about to delete a product");
		 System.out.print("Enter brand: ");
		 String brand = s.nextLine();
		 System.out.print("Enter model: ");
		 String model = s.nextLine();
		 Key key = new Key(brand, model);
		map.remove(key);
	}
	
	public static void changePrice (Map<Key, HashProduct> map, Scanner s) {
		String brand;
		String model;
		int price; 
		System.out.println("You are changing the price of a product");
		 System.out.print("Enter brand: ");
		 brand = s.nextLine();
		 System.out.print("Enter model: ");
		 model = s.nextLine();
		 System.out.print("Enter new price: ");
		 price = s.nextInt();
		 Key key = new Key(brand, model);
		 HashProduct product = new HashProduct(key, price);
		map.put(key, product);
	}
	
	public static void printingMap (Map<Key, HashProduct> map) {
		Iterator<Entry<Key, HashProduct>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			Map.Entry<Key, HashProduct> data = iter.next();
			System.out.println(data.getKey() + "-->" + data.getValue());
		}
	}

}

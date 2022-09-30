import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DemoArrayList {

	public static void main(String[] args) {

		List <Product> allProducts = new LinkedList<>();
		allProducts.add(new Product("name1", 15));
		allProducts.add(new Product("name2", 20));
		allProducts.add(new Product("name3", 25));
		allProducts.add(new Product("name4", 10));
		allProducts.add(new Product("name5", 17));
		allProducts.add(new Product("name6", 50));
		allProducts.add(new Product("name7", 100));
		allProducts.add(new Product("name8", 40));
		allProducts.add(new Product("name9", 36));
		allProducts.add(new Product("name10", 97));
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter min price:  ");
		int min = s.nextInt();
		System.out.print("Enter max price:  ");
		int max = s.nextInt();
		
		insideOfInterval (allProducts, min, max);
		
		System.out.println("Enter 1 for sorting by Name");
		System.out.println("Enter 2 for sorting by Price");
		System.out.print("Your choice:  ");
		int choice = s.nextInt();
		if (choice == 1) {
			sortByName(allProducts);
		}
		else if (choice == 2) {
			sortByPrice(allProducts);
		}
		
		s.close();
	}
	
	
	
	public static void insideOfInterval (List <Product> allProducts, int min, int max) {
		System.out.println("Products in the price range: " + min + " - " + max);
		int count = 0;
		for (int i=0; i<allProducts.size(); i++ ) {
			if ((allProducts.get(i).getPrice()) >= min  &&  (allProducts.get(i).getPrice()) <= max){
				System.out.println("Product " + allProducts.get(i).getName()  + "  with price of " +  allProducts.get(i).getPrice());
				count++;
			}
		}
		if (count==0){
			System.out.println("No products found within this range! ");
		}
	}
	
	
	
	public static void sortByName(List <Product> allProducts) {
		allProducts.sort(new MyComparator()); 
        System.out.println("Sorting based on Name:");
        for(Product currproduct : allProducts)
        {  
            System.out.println("Name: " + currproduct.getName() + " -> Price: " + currproduct.getPrice());
        }
	}

	
	
	public static void sortByPrice(List <Product> allProducts) {
		allProducts.sort(new ComparatorByPrice()); 
        System.out.println("Sorting based on Price:");
        for(Product currproduct : allProducts)
        {  
            System.out.println("Name: " + currproduct.getName() + " -> Price: " + currproduct.getPrice());
        }
	}
	
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int age = 0;
		String name = null ;
		Scanner s= new Scanner(System.in);
		
		for (int i=0; i<3; i++) {
			name = s.nextLine();
			age = s.nextInt();
		}
		System.out.println(age + name);
	}

}
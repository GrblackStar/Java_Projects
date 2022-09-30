import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		System.out.print("Enter email:  ");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		
		Pattern pattern = Pattern.compile(".+@([gmail]|[abv])[.]([com]|[bg])");
		Matcher matcher = pattern.matcher(inputString);
	
		while(matcher.find()  &&  matcher.group().equals(inputString)) {
		     System.out.println("Valid email address");
		}
		System.out.print("no");
		scanner.close();

	}
	}
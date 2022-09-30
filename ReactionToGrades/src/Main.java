import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter grade (2-6): ");
		int grade = s.nextInt();
		
		Student student = new Student();
		System.out.println(student.reaction(grade));
		
		s.close();

	}

}

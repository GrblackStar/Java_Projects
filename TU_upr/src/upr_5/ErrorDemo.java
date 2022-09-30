package upr_5;

public class ErrorDemo {

	private static int count;
	public static void main(String[] args) {
		recursiveMethod();

	}
	
	public static void recursiveMethod() {
		System.out.println(++count+" recursive execution");
		recursiveMethod();
	}

}

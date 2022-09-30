package upr_8;

public class DemoStudents {

	public static void main(String[] args) {
		String[] names = {"Ivancho","Gancho","Mariika","Dancho","Pancho","Vancho","Siika","Ginka","Penka","Pesho"};
		int[] grades = {5,2,6,4,6,6,2,4,5};
		
		calcAvgGrade(grades);
		printFailedStudents(names,grades);
	}

	private static void calcAvgGrade(int[] grades) {
		double sum = 0;
		for(int i=0; i<grades.length; i++) {
			sum+=grades[i];
		}
		System.out.println("Average grade:"+sum/grades.length);
	}
	
	private static void printFailedStudents(String[] names,int[] grades) {
		for(int i=0; i<grades.length; i++) {
			if(grades[i]==2) {
				System.out.println("student:"+names[i]);
			}
		}	
	}
}

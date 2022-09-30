package upr_8;

public class DemoArrayObj {

	public static void main(String[] args) {
		Student[] students = {new Student("Ivancho",5),new Student("Gancho",2),new Student("Mariika",6),new Student("Dancho",4),new Student("Pancho",6),new Student("Vancho",6),new Student("Siika",3),new Student("Ginka",2),new Student("Penka",4),new Student("Pesho",5)};
		
		calcAvgGrade(students);
		printFailedStudents(students);
		
	}

	private static void calcAvgGrade(Student[] students) {
		double sum = 0;
		for(int i=0; i<students.length; i++) {
			sum+=students[i].getGrade();
		}
		System.out.println("Average grade:"+sum/students.length);
	}
	
	private static void printFailedStudents(Student[] students) {
		for(int i=0; i<students.length; i++) {
			if(students[i].getGrade()==2) {
				System.out.println("student:"+students[i].getName());
			}
		}
	}
}

package upr_8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsOfStudents {

	public static void main(String[] args) {
		List<Student> students = new LinkedList<>();
		//List<Student> students = new ArrayList<>();
		
		students.add(new Student("Ivancho",5));
		students.add(new Student("Gancho",2));
		students.add(new Student("Mariika",6));
		students.add(new Student("Dancho",4));
		students.add(new Student("Pancho",6));
		students.add(new Student("Vancho",6));
		students.add(new Student("Siika",3));
		students.add(new Student("Ginka",2));
		students.add(new Student("Penka",4));
		students.add(new Student("Pesho",5));
		
		calcAvgGrade(students);
		printFailedStudents(students);
		testStudentKnowledge(students,1, 6);
		System.out.println(students);
		
		MyComparator comparator = new MyComparator();
//		students.sort(comparator);
		Collections.sort(students, comparator);
		
		System.out.println(students);
		
	}

	private static void calcAvgGrade(List<Student> students) {
		double sum = 0;
		for(int i=0; i<students.size(); i++) {
			sum+=students.get(i).getGrade();
		}
		System.out.println("Average grade:"+sum/students.size());
	}
	
	private static void printFailedStudents(List<Student> students) {
		for(int i=0; i<students.size(); i++) {
			if(students.get(i).getGrade()==2) {
				System.out.println("student:"+students.get(i).getName());
			}
		}
		
	}
	
	private static void testStudentKnowledge(List<Student> students,int index, int grade) {
		Student s = students.get(index);
		s.setGrade(grade);
		students.set(index, s);
	}

}

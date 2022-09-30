package upr_10;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CollectionOfStudents {

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
		
		Comparator<Student> comparator = new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if(s1.getName().compareTo(s2.getName())>0)
					return 1;
				else if(s1.getName().compareTo(s2.getName())<0)
					return -1;
				return 0;
			}
		};
		
		students.sort(comparator);
//		Collections.sort(students, comparator);
		
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
//		double sum = 0;
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

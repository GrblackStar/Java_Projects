package upr_14C;

public class Student extends User {
	private double avgGrade;
	
	public Student(String username, String password) {
		super(username, password);
		this.avgGrade = 2;
	}

	public Student(String username, String password, double avgGrade) {
		super(username, password);
		setAvgGrade(avgGrade);
	}

	public double getAvgGrade() {
		return avgGrade;
	}

	public void setAvgGrade(double avgGrade) {
		if (avgGrade>=2 && avgGrade<=6) {
		this.avgGrade = avgGrade;
		}
	}

}


public class Student {
	public int grade;

	public String reaction(int grade) {
		class Help implements Greetable {
			public static String greatingOrBeating(int grade) {
				String mom;
				String dad;

				if (grade < 4) {
					mom = "beat";
					dad = "beat";
				} else {
					mom = "great";
					dad = "great";
				}

				return ("dad: " + dad + "\n" + "mom: " + mom);
			}
		}
		return Help.greatingOrBeating(grade);
	}

}

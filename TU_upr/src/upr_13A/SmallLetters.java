package upr_13A;

public class SmallLetters extends Thread {
	private StringBuilder str;

	public SmallLetters(StringBuilder str) {
		super();
		this.str = str;
	}

	@Override
	public void run() {
		char ch = 'a';
		for (char i = 0; i < 1000; i++) {
			if (ch > 'z') {
				ch = 'a';
			}
			synchronized (str) {
				str.append(ch++);
			}
		}
	}
}

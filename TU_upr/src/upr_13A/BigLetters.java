package upr_13A;

public class BigLetters extends Thread {
	private StringBuilder str;

	public BigLetters(StringBuilder str) {
		super();
		this.str = str;
	}

	@Override
	public void run() {

		char ch = 'A';
		for (char i = 0; i < 1000; i++) {
			if (ch > 'Z') {
				ch = 'A';
			}
//			synchronized (str) {
//				str.append(ch++);
//			}
			append(ch);
			ch++;
		}
	}
	
	public synchronized void append(char ch) {
		str.append(ch);
	}
}

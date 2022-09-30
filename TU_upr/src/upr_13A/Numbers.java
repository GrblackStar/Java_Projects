package upr_13A;

public class Numbers extends Thread {
	private StringBuilder str;

	public Numbers(StringBuilder str) {
		super();
		this.str = str;
	}

	@Override
	public void run() {
		char ch = '0';
		for (char i = 0; i < 1000; i++) {
			if (ch > '9') {
				ch = '0';
			}
			synchronized (str) {
				str.append(ch++);
			}
		}
	}
}

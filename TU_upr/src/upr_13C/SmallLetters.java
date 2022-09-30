package upr_13C;

public class SmallLetters extends Thread {
	private StringBuffer str;

	public SmallLetters(StringBuffer str) {
		super();
		this.str = str;
	}

	@Override
	public void run() {
		char ch = 'a';
		for(char i=0; i<1000; i++) {
			if(ch>'z') {
				ch = 'a';
			}
			str.append(ch++);
		}
	}
}
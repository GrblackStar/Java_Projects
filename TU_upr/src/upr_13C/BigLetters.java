package upr_13C;


public class BigLetters extends Thread {
	private StringBuffer str;

	public BigLetters(StringBuffer str) {
		super();
		this.str = str;
	}

	@Override
	public void run() {
		char ch = 'A';
		for(char i=0; i<1000; i++) {
			if(ch>'Z') {
				ch = 'A';
			}
			str.append(ch++);
		}
	}

}
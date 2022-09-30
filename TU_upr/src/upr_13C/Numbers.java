package upr_13C;

public class Numbers extends Thread {
	private StringBuffer str;

	public Numbers(StringBuffer str) {
		super();
		this.str = str;
	}

	@Override
	public void run() {
		char ch = '0';
		for(char i=0; i<1000; i++) {
			if(ch>'9') {
				ch = '0';
			}
			str.append(ch++);
		}
	}
}

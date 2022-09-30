package upr_13B;


public class BigLetters extends Thread {
	private MyString str = new MyString();

	public BigLetters(MyString str) {
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
			
			//adding characters to string
			str.append(ch++);
			
		}
	}
	
	
	

}


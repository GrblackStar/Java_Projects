package upr_13B;

public class SmallLetters extends Thread {
	private MyString str = new MyString();
	
	public SmallLetters(MyString str) {
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

				str.append(ch++);

		}
	}
}
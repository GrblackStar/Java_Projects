package upr_13B;

public class MyString {
	private StringBuilder str = new StringBuilder("");

	public StringBuilder getStr() {
		return str;
	}

	public synchronized void append(char ch) {
		//synchronized(this) {
			str.append(ch);
		//}
	}

}

package upr_13B;

public class Demo {
	public static void main(String[] args) {
		MyString str = new MyString();
		
		Numbers thread1 = new Numbers(str);
		SmallLetters thread2 = new SmallLetters(str);
		BigLetters thread3 = new BigLetters(str);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			//Thread.sleep(6000);
		} catch (InterruptedException e) {

		}
		
		System.out.println(str.getStr());
		System.out.println(str.getStr().length());

	}
}

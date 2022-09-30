package upr_13C;

public class Demo {
	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("");
		
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
		
		System.out.println(str);
		System.out.println(str.length());

	}
}

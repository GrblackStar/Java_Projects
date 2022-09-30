package upr_13A;

public class Demo {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("");
		
		Numbers thread1 = new Numbers(str);
		SmallLetters thread2 = new SmallLetters(str);
		BigLetters thread3 = new BigLetters(str);
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		//join() method waits for the threads to finish
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			//Thread.sleep(6000);
		} catch (InterruptedException e) {

		}
		
		//doesn't work: does mat save info to string; str is immutable
		System.out.println(str);
		System.out.println(str.length());

	}
}

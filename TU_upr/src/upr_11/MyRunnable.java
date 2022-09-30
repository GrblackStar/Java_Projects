package upr_11;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i=1; i<=300; i++) {
			System.out.println(Thread.currentThread().getName() + ":  " + i);
		}

		
	}

}

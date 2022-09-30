package upr_11;

public class RunnableDemo {

	public static void main(String[] args) {
//		MyRunnable runnable = new MyRunnable();
		
		MyRunnable runnable1 = new MyRunnable();
		
		Runnable runnable2 = new Runnable() {
			@Override
			public void run() {
				for (int i=1; i<=500; i++) {
					System.out.println(Thread.currentThread().getName() + ":  " + i);
				}
			}
		};
		
		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		
		thread1.start();
		thread2.start();
		
		for (int i=1; i<=300; i++) {
			System.out.println(Thread.currentThread().getName() + ":  " + i);
		}


	}

}

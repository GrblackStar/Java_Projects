package upr_11;

public class ThreadDemo {

	public static void main(String[] args) {
		int max1 = 600;
		MyThread thread1 = new MyThread("MyThread", 400);
		
		//anonymous class
		Thread thread3 = new Thread() {

			@Override
			public void run() {
				for (int i=1; i<=max1; i++) {
					System.out.println(this.getName() + ":  " + i);
				}
			}
		};
		
		thread1.start();
		thread3.start();
		
		for (int i=1; i<=300; i++) {
			System.out.println(Thread.currentThread().getName() + ":  " + i);
		}

		

	}

}

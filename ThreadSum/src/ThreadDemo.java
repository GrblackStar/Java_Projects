
public class ThreadDemo {

	public static void main(String[] args) {
		int max = 600;
		int min = 1;
		MyThread thread1 = new MyThread("MyThread1", 1, 30);
		MyThread thread2 = new MyThread("MyThread2", 1, 40);
		
		//anonymous class
		Thread thread3 = new Thread() {
//			int max = 600;
//			int min = 1;
			@Override
			public void run() {
				int sum = 0;
				for (int i=min; i<=max; i++) {
					sum += i;
					System.out.println(this.getName() + " sum" + ":  " + sum);	
				}
			}
		};
		
		thread1.start();
		thread2.start();
		thread3.start();	

	}

}

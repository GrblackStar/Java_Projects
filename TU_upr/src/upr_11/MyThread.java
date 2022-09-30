package upr_11;

public class MyThread extends Thread{
	private int max;
	public MyThread (int max) {
		super();
		this.max = max;
	}
	
	public MyThread (String name, int max) {
		super(name);
		this.max = max;
	}

	@Override
	public void run() {
		for (int i=1; i<=max; i++) {
			System.out.println(this.getName() + ":  " + i);
			//after the print, we are telling it to sleep for 1000ms aka not to run for that time
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("the thread was interupted");
			}
		}

	}

}


public class MyThread extends Thread {
	private int max;
	private int min;
	
	public MyThread (int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
	
	public MyThread (String name,int min, int max) {
		super(name);
		this.min = min;
		this.max = max;
	}

	@Override
	public void run() {
		int sum = 0;
		for (int i=min; i<=max; i++) {
			sum += i;
			System.out.println(this.getName() + " sum" + ":  " + sum);
			
		}

	}

}

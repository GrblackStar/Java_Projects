import java.util.Queue;
import java.util.Random;

public class QA extends Thread{
	Software item;
	@Override
	public void run() {
		while(true)
		{
			if(this.item.getCode().isEmpty()!=true)
			passOrFail();
		}
	}
	public QA (Software item) {
		this.item = item;
	}

	public void passOrFail()
	{
		Random x = new Random();
		if(x.nextBoolean() == true)
		{
			System.out.println("QA took "+this.item.getCode().peek()+" to test.");
			Queue<String> pass = this.item.getPass();
			System.out.println("QA added "+this.item.getCode().peek()+" for verification.");
			pass.add(this.item.getCode().peek());
			this.item.getCode().poll();
		}
		else
		{
			System.out.println("QA took "+this.item.getCode().peek()+" to test.");
			Queue<String> fail = this.item.getFail();
			System.out.println("QA added "+this.item.getCode().peek()+" for editing.");
			fail.add(this.item.getCode().peek());			
			this.item.getCode().poll();	
		}
		
	}

}

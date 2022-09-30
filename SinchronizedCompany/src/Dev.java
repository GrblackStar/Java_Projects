
import java.util.Queue;

public class Dev extends Thread{

	Software item;
	@Override
	public void run() {
		while(true)
		{
			if(item.getFail().isEmpty()!=true)
			{
				refactor();
			}
			else if((item.getRecuirements().isEmpty()!=true))
			{
				recToCode();
			}
			
		}
	}
	public Dev(Software item) {
		this.item = item;
	}

	public void recToCode()
	{
		System.out.println("Dev took "+this.item.getRecuirements().peek()+" to implement.");
		Queue<String> code = this.item.getCode();
		System.out.println("Dev added "+this.item.getRecuirements().peek()+" for testing.");
		code.add(this.item.getRecuirements().peek());		
		this.item.getRecuirements().poll();
	}
	public void refactor()
	{
		System.out.println("Dev took "+this.item.getFail().peek()+" to refactor.");
		Queue<String> code = this.item.getCode();
		System.out.println("Dev added "+this.item.getFail().peek()+" for testing.");
		code.add(this.item.getFail().peek());
		this.item.getFail().poll();
	}
}


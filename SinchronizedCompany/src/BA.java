import java.util.Queue;

public class BA extends Thread {
    Software item;
    
    
	@Override
	public void run() {
		int x=1;
		while(true){
			if(item.getPass().isEmpty() == true){
				if(x<50){
					addRec(x);
				}
				x++;
			}else{
				passToReady();
			}
		}
	}

	public BA(Software item) {
		this.item = item;
	}
	public void addRec(int x)
	{
		Queue<String> rec = this.item.getRecuirements();
		rec.add("item "+(rec.size()+1));
		System.out.println("BA added item "+x+" for development");	
	}
	public void passToReady()
	{
		Queue<String> ready = this.item.getReady();
		ready.add(this.item.getPass().peek());
		System.out.println("BA added "+this.item.getPass().peek()+" in ready");
		this.item.getPass().poll();
	}

}


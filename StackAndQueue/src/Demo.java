
public class Demo {
	public static void main(String[] args) {

		MyQueue queue = new MyQueue();

		System.out.println("queue size: "+queue.getSize());
		for(int i=1;i<10;i++) {
			queue.push(i);
		}
		
		
		System.out.println("queue size: "+queue.getSize());
		while(queue.getSize()>0) {
			int value = queue.pop();
			System.out.println(value);
		}
		
		
		System.out.println("queue size: "+queue.getSize());
	}

}

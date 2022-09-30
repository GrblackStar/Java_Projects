package upr_10;

public class Demo {

	public static void main(String[] args) {
//		MyStack.Node node = new MyStack(). new Node(5);
		MyStack stack = new MyStack();
//		MyStack.Node node = stack. new Node(5);
		System.out.println("Stack size: "+stack.getSize());
		for(int i=1;i<10;i+=2) {
			stack.push(i);
		}
		System.out.println("Stack size: "+stack.getSize());
		while(stack.getSize()>0) {
			int value = stack.pop();
			System.out.println(value);
		}
		System.out.println("Stack size: "+stack.getSize());
	}

}
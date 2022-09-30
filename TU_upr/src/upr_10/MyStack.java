package upr_10;

public class MyStack {

	private Node top;
	private int size;
	
	
	public Node getTop() {
		return top;
	}
	public void setTop(Node top) {
		this.top = top;
	}

	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	
	public void push(Integer value) {
		Node node = new Node(value);
		node.next=top;
		top = node;
		//size++;
	}
	
	public Integer pop() {
		if(top==null) {
			return null;
		}
		Integer value = top.value;
		top = top.next;
		size--;
		return value;
	}
	
	private class Node {
		private Integer value;
		private Node next;
		
		public Node(Integer value) {
			this.value = value;
			size++;
		}
	}
}

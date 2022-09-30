
public class MyQueue {
	private Help head;
	private Help tail;
	private int size;
	
	
	public Help getHead() {
		return head;
	}
	public void setHead(Help head) {
		this.head = head;
	}
	public Help getTail() {
		return tail;
	}
	public void setTail(Help tail) {
		this.tail = tail;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	
	public void push(Integer value) { 
	 Help help = new Help(value);
	 if(head == null) {  
         head = help;  
         tail = help;  
        
         head.previous = null;    
         tail.next = null;    
     }else {    
         tail.next = help;        
         help.previous = tail;     
         tail = help;        
         tail.next = null;    
     }    
	}
	
	
	public Integer pop() {
		if(head==null) {
			return null;
		}
		Integer value = tail.value;
		tail = tail.previous; 
		size--;
		return value;
	}


	private class Help {
		private Integer value;
		@SuppressWarnings("unused")
		private Help next = null;
		private Help previous = null;
		
		public Help(Integer value) {
			this.value = value;
			size++;
		}
	}

}

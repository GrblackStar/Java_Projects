import java.util.LinkedList;
import java.util.Queue;

public class Software {	
	private Queue <String> recuirements = new LinkedList <String>();
	private Queue <String> code = new LinkedList <String>();
	private Queue <String> pass = new LinkedList <String>();
	private Queue <String> fail = new LinkedList <String>();
	private Queue <String> ready = new LinkedList <String>();
	
	public Queue <String> getRecuirements() {
		return recuirements;
	}
	public synchronized void setRecuirements(Queue<String> recuirements) {
		this.recuirements = recuirements;
	}
	
	public synchronized Queue<String> getCode() {
		return code;
	}
	public synchronized void setCode(Queue<String> code) {
		this.code = code;
	}
	
	public synchronized Queue<String> getPass() {
		return pass;
	}
	public synchronized void setPass(Queue<String> pass) {
		this.pass = pass;
	}
	
	public synchronized Queue<String> getFail() {
		return fail;
	}
	public synchronized void setFail(Queue<String> fail) {
		this.fail = fail;
	}
	
	public synchronized Queue<String> getReady() {
		return ready;
	}
	public synchronized void setReady(Queue<String> ready) {
		this.ready = ready;
	}
	
}



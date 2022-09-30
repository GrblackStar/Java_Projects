package upr_4;

public class Cat extends Animal implements Speakable,Walkable {
	private String nails;
	
	public String getNails() {
		return nails;
	}

	public void setNails(String nails) {
		this.nails = nails;
	}


	@Override
	public String speak() {
		return MIAU_MIAU;
	}

	@Override
	public String walk() {
		return "sneaks";
	}

	@Override
	public void defaultMethod() {
		Walkable.super.defaultMethod();
	}
	
	@Override
	public String speak1() {
		return "Miau-Miau";
	}

}

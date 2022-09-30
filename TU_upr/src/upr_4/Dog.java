package upr_4;

public class Dog extends Animal implements Speakable,Walkable{
	
	@Override
	public String speak() {
		return BAU_BAU;
	}

	@Override
	public String walk() {
		return "runs";
	}

	@Override
	public void defaultMethod() {
		System.out.println("Dog default method was executed.");
	}
	
	@Override
	public String speak1() {
		return "bau_bau";
	}
}

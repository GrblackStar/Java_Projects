package upr_4;

public interface Walkable {
	public abstract String walk();
	
	public default void defaultMethod() {
		System.out.println("Walkable default method was executed.");
	}
}

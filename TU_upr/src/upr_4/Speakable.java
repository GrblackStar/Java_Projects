package upr_4;

public interface Speakable {
	String MIAU_MIAU = "Miau-miau";//public final static 
	String BAU_BAU = "Bau-bau";
	String speak();//public abstract

	public default void defaultMethod() {
		System.out.println("Speakble default method was executed.");
	}
	
	public static void staticMethod() {
		System.out.println("Static method was executed.");
	}
	
//	private default void privateDefaultMethod() {
//		System.out.println("Speakble default method was executed.");
//	}
//	
//	private static void privateStaticMethod() {
//		System.out.println("Static method was executed.");
//	}
}

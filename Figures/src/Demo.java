
public class Demo {
	 public static void main(String[] args){
	        Square square = new Square(5.0);
	        Rectangle rectangle = new Rectangle (6.0, 7.0);
	        
	        System.out.printf("Square Perimeter: %.1f\tArea: %.1f\n\n", square.calcPerimeter(), square.calcArea());
	        System.out.printf("Rectangle Perimeter: %.1f\tArea: %.1f\n\n", rectangle.calcPerimeter(), rectangle.calcArea());
	    }
}

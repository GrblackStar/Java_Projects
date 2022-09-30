
public class Square extends Figures	{
    private double a;
    public Square(double a){
        super();
        this.a = a;
    }
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    
    public double calcPerimeter(){
        return 4*a;
    }

    
    public double calcArea(){
        return a * a;

	    }
}
	




public abstract class Figures {
    private double side;
    

    public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	

    abstract double calcArea();
    abstract double calcPerimeter();
}

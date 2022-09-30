
public class HashProduct {
    private Key key;
	private int price;
	
	public HashProduct(Key key, int price) {
		super();
		this.price = price;
		this.key = key;
	}

	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

	@Override
	public String toString() {
		return "HashProduct [" + key.toString() + "price=" + price + "]";
	}


}

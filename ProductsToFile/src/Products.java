
public class Products {
	private String name;
	private int price;
	
	public Products (String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name != null  &&  !name.equals("")) {
		    this.name = name;
		}
	}

	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if (price > 0) {
		    this.price = price;
		}
	}
}

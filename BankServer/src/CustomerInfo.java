
public class CustomerInfo {
	private int customerId;
	private String customerName;
	private double balance;
	
	public CustomerInfo(int customerId, String customerName, double balance) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.balance = balance;
	}

	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	@Override
	public String toString() {
		return "CustomerInfo [" + customerId + customerName +  balance + "]";
	}
}

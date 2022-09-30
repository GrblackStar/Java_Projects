import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

public class CustomerThread extends Thread {
	private Socket socket;
	private List<CustomerInfo> listofUsers;
	private List<BranchInfo> listofBranches;

	public CustomerThread(Socket socket, List<CustomerInfo> listofUsers, List<BranchInfo> listofBranches) {
		super();
		this.socket = socket;
		this.listofUsers = listofUsers;
		this.listofBranches = listofBranches;
	}

	@Override
	public void run() {
		try (PrintStream writer = new PrintStream(socket.getOutputStream(), true);
				Scanner reader = new Scanner(socket.getInputStream())) {

			writer.print("Enter branch ID: ");
			int branchID = reader.nextInt();
			reader.nextLine();

			BranchInfo authorizedBranch = null;
			CustomerInfo authorizedCustomer = null;
			for (BranchInfo branch : listofBranches) {
				if (branchID == branch.getBranchId()) {
					writer.println("Correct authorization ID ");
					authorizedBranch = branch;
					break;
				}
			}


			// checking if we have found such user
			if (authorizedBranch != null) {
				writer.print("Enter customer ID: ");
				int customerID = reader.nextInt();
				reader.nextLine();

				writer.print("Enter customer name: ");
				String customerName = reader.nextLine();

				// checking for this customer:
				for (CustomerInfo customer : listofUsers) {
					if (customerID == customer.getCustomerId() && customerName.equals(customer.getCustomerName())) {
						writer.println("Correct authorization ID ");
						authorizedCustomer = customer;
						break;
					}
				}

				if (authorizedCustomer != null) {
					writer.println(authorizedCustomer.getCustomerId() + " * " + authorizedCustomer.getCustomerName()
							+ " * " + authorizedCustomer.getBalance());
					
				} else {
					System.err.println("No such customer found. Please try again ");
					writer.println ("No such customer found. Please try again ");
				}

			} else {
				System.err.println("Incorrect authorization ID. Please try again ");
				writer.println("Incorrect authorization ID. Please try again ");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}

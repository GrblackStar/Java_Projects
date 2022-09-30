import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class BankServer {

	public static void main(String[] args) {
		List<CustomerInfo> listofUsers = new LinkedList<>();
		List<BranchInfo> listofBranches = new LinkedList<>();
		Random genNumber = new Random();

		// creating 30 branches:
		for (int branchesNum = 0; branchesNum < 30; branchesNum++) {
			listofBranches.add(new BranchInfo(branchesNum));
		}

		// creating 300 clients:
		for (int clientNum = 0; clientNum < 300; clientNum++) {
			listofUsers.add(new CustomerInfo(clientNum, "name" + clientNum, genNumber.nextDouble()));
		}
		
		
		//creating the server
		try (ServerSocket server = new ServerSocket(1211)) {
			// printing all users:
			//System.out.println(listofUsers);

			// when in loop, the server expects more than one user to connect:
			while (true) {
				System.out.println("Server is waiting for connection...");
				Socket socket = server.accept();

				CustomerThread client = new CustomerThread(socket, listofUsers, listofBranches);
				client.start();
			}
		} catch (IOException e) {
			System.err.println("the port 1211 is already in use");
		}

	}
}

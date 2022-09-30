package upr_14;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MultiUserServer {

	public static void main(String[] args) {
		// CREATING SERVER:
		// we create a loop
		// THIS SERVER NEED TO FINISH WITH ONE USER, SO IT CAN CONTINUE COMMUNICATION WITH THE OTHER
		// SYNCHRONIZED

		try (ServerSocket server = new ServerSocket(8081)) {
			System.out.println("Server is waiting for connection...");

			//when in loop, the server expects more than one user to connect:
			while (true) {
				Socket socket = server.accept();
				try (PrintStream writer = new PrintStream(socket.getOutputStream(), true);
						Scanner reader = new Scanner(socket.getInputStream())) {

					System.out.println("Hello from server");
					writer.println("Hello from server");
					String line = reader.nextLine();
					System.out.println(line);

				}
			}
		} catch (IOException e) {
			System.err.println("the port 8081 is already in use");
		}
	}
}

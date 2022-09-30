package upr_14;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {
	public static void main(String[] args) {
        //CREATING ONE-CLIENT SERVER:

		try (ServerSocket server = new ServerSocket(8081)) {
			 System.out.println("Server is waiting for connection...");
			 
			// allowing someone to connect to the server: server.accept()
			// to make a channel for communication we need another Socket object
			Socket socket = server.accept();

			// then we need flows for reading and writing:
			// NODE: the TRUE parameter acts as an automatic flush(), so we don't need to
			// call it
			// writing the recourses in try block so we don't need to close them:
			try (PrintStream writer = new PrintStream(socket.getOutputStream(), true);
					 Scanner reader = new Scanner(socket.getInputStream())) {
				
				System.out.println("Hello from server");
				//the server is sending a message:
				writer.println("Hello from server");
				//reading a message from the user:
				String line = reader.nextLine();
				//printing it on the server:
				System.out.println(line);
				
				//then you need to enter the application, the host, and the port in the terminal:
				//example: telnet localhost 8081

			}

		} catch (IOException e) {

			System.err.println("the port 8081 is already in use");
		}
	}

}

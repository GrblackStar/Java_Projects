package upr_14B;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadServer {

	public static void main(String[] args) {
		//PARALEL USING OF THE SERVER
		
		try (ServerSocket server = new ServerSocket(8081)) {

			//when in loop, the server expects more than one user to connect:
			while (true) {
				System.out.println("Server is waiting for connection...");
				Socket socket = server.accept();
				
				ClientThread client = new ClientThread(socket);
				client.start();
			}
		} catch (IOException e) {
			System.err.println("the port 8081 is already in use");
		}

	}

}
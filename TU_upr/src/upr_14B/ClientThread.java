package upr_14B;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientThread extends Thread{
	private Socket socket;

	public ClientThread(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try (PrintStream writer = new PrintStream(socket.getOutputStream(), true);
				Scanner reader = new Scanner(socket.getInputStream())) {

			System.out.println("Hello from server");
			writer.println("Hello from server");
			String line = reader.nextLine();
			System.out.println(line);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
	

}

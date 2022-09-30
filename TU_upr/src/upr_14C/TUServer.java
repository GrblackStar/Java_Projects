package upr_14C;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class TUServer {

	public static void main(String[] args) {
		// PARALEL USING OF THE SERVER

		// making a list with user name and passwords:
		// DO NOT make it static, because it goes to the cache and causes problems
		List<User> listofUsers = new LinkedList<>();

		// we need random grades -> we use Random class:
		Random gen = new Random();

		// entering two employees with user name and password:
		listofUsers.add(new Employee("user1@tu-sofia.bg", "user1"));
		listofUsers.add(new Employee("user2@tu-sofia.bg", "user2"));

		// then we create students:
		// creating them in a loop
		// we start from 3, because user1 and 2 are already in use
		for (int i = 3; i < 300; i++) {
			// gen.nextInt(5)+2 -> when we say 5, it generates a number from 0 to 4
			// that's why we add 2, so we can get an actual grade
			// random number = 3. we add 2. and the final grade is 5
			// gen.nextDouble -> generating the decimal
			double avgGrade = Math.round((gen.nextInt(5) + 2 + gen.nextDouble()) * 100) / 100.0;
			listofUsers.add(new Student("user" + i + "@tu-sofia.bg", "user" + i, avgGrade));

			try (ServerSocket server = new ServerSocket(8081)) {

				// printing all users:
				System.out.println(listofUsers);

				// when in loop, the server expects more than one user to connect:
				while (true) {
					System.out.println("Server is waiting for connection...");
					Socket socket = server.accept();

					TUThread client = new TUThread(socket, listofUsers);
					client.start();
				}
			} catch (IOException e) {
				System.err.println("the port 8081 is already in use");
			}

		}
	}
}

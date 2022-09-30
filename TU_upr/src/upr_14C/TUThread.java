package upr_14C;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

public class TUThread extends Thread{
	private Socket socket;
	private List<User> users;

	public TUThread(Socket socket, List<User> users) {
		super();
		this.socket = socket;
		this.users = users;
	}

	@Override
	public void run() {
		try (PrintStream writer = new PrintStream(socket.getOutputStream(), true);
				Scanner reader = new Scanner(socket.getInputStream())) {
			
			//List<User> users = TUServer.getListofUsers();
			
			//printing all users:
			//writer.println(users);

			//the server is asking for user name
			writer.print("username: ");
			//the server reads the user name from the user
			String username = reader.nextLine();
			
			//asking for password:
			writer.print("password: ");
			String password = reader.nextLine();
			
			//now check if there is a user with this password:
			//finding the user and saving them to a variable
			//the for loop is just for finding the user
			User authorizedUser = null;
			for(User user : users) {
				if(username.equals(user.getUsername()) && password.equals(user.getPassword())) {
					authorizedUser = user;
					break;
				}
			}
			
			//checking if we have found such user
			if(authorizedUser != null) {
				//checking is the user is a student:
				if (authorizedUser instanceof Student) {
					double avgGrade = ((Student)authorizedUser).getAvgGrade();
					writer.println("Your average grade: " + avgGrade);
				}else {
					writer.print("Student username: ");
					username = reader.nextLine();
					authorizedUser = null;
					for(User user : users) {
						if(username.equals(user.getUsername())) {
							authorizedUser = user;
							break;
						}
					}
					if (authorizedUser instanceof Student) {
						double avgGrade = ((Student)authorizedUser).getAvgGrade();
						writer.println("Your average grade: " + avgGrade);
					}else {
						writer.println("The user is a TU employee");
					}
					if (authorizedUser==null) {
						writer.println("Student not found");
					}
				}
			}else {
				writer.println("Wrong username of password");
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
	


}

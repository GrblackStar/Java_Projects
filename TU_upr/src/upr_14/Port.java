package upr_14;

import java.io.IOException;
import java.net.ServerSocket;

public class Port {
	public static void main(String[] args) {
		//the following code checks which ports are already in use
		//there are 65536 ports in total
		for (int port=0; port<65536; port++) {
			//when written in try block, the resource is closed automatically
			//if not we must close it in the "finally" block
			try(ServerSocket server = new ServerSocket(port)){
				//System.out.println("Server is waiting for connection...");
			}catch (IOException e) {
				//err prints the characters in red
				System.err.println("the port " +port+ " is already in use");
			}
		}

	}
}

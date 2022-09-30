import java.util.*;
import java.util.Map.Entry;

public class Program {
	public static void main(String[] args) {
		HashMap<String, Integer> players = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			String input = sc.nextLine();
			String[] values = input.split(" ");
			String name = values[0];
			int points = Integer.parseInt(values[1]);
			players.put(name, points);
		}
		
		// This will return max value in the Hashmap
		int maxValueInMap = (Collections.max(players.values()));
		
		// Itrate through hashmap
		for (Entry<String, Integer> entry : players.entrySet()) {
			if (entry.getValue() == maxValueInMap) {
				// Print the key with max value
				System.out.println(entry.getKey());
			}

			sc.close();
		}
	}
}

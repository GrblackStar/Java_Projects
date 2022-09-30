/*1)Import the package
  2)Load and Register driver
  3)Create Connection
  4)Create Statement
  5)Execute the query
  6)process the results
  7)close connection
*/

import java.sql.*;



public class BulsatDemo {

	public static void main(String[] args) {
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/bulsatcom";
			String uname = "root";
			String pass = "78spnblackstar19";
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, uname, pass);

			Statement statement = connection.createStatement();

			// creating a query:
			ResultSet resultSet = statement.executeQuery("SELECT name FROM users");
			while (resultSet.next()) {
				System.out.println(resultSet.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

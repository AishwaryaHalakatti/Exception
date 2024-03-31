
package finallyExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FinallyExample {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Replace "jdbc:mysql://localhost:3306/mydatabase" with your actual database URL
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String username = "your_username";
            String password = "your_password";

            // Attempt to establish a database connection
            connection = DriverManager.getConnection(url, username, password);

            // Perform database operations (not shown in this simplified example)
            System.out.println("Connected to the database.");

        } catch (SQLException e) {
            // Handle SQLException (e.g., connection failure)
            System.out.println("Error: Unable to connect to the database - " + e.getMessage());

        } finally {
            // Ensure that the database connection is closed, even if an exception occurred
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("Database connection closed.");
                }
            } catch (SQLException e) {
                // Handle the exception if closing the connection fails
                System.out.println("Error: Unable to close the database connection - " + e.getMessage());
            }
        }
    }
}
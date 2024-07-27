import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BusinessDatabase {

    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASSWORD = "password"; // change to your MySQL password

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Create a statement object to execute SQL statements
            statement = connection.createStatement();

            // Create database Business
            String sql = "CREATE DATABASE IF NOT EXISTS Business";
            statement.executeUpdate(sql);
            System.out.println("Database created successfully...");

            // Use the created database
            statement.executeUpdate("USE Business");

            // Create table clientaddress
            sql = "CREATE TABLE IF NOT EXISTS clientaddress (" +
                  "id INT NOT NULL AUTO_INCREMENT, " +
                  "name VARCHAR(50), " +
                  "address VARCHAR(100), " +
                  "PRIMARY KEY (id))";
            statement.executeUpdate(sql);
            System.out.println("Table created successfully...");

            // Insert a record into the table
            sql = "INSERT INTO clientaddress (name, address) VALUES ('John Doe', '123 Elm Street')";
            statement.executeUpdate(sql);
            System.out.println("Record inserted successfully...");

            // Display records
            sql = "SELECT * FROM clientaddress";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                System.out.println("ID: " + id + ", Name: " + name + ", Address: " + address);
            }

            // Clean-up environment
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // finally block used to close resources
            try {
                if (statement != null) statement.close();
            } catch (SQLException se2) {
            }
            try {
                if (connection != null) connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}

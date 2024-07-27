import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CityDatabase {
    
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

            // Create database CityDB
            String sql = "CREATE DATABASE IF NOT EXISTS CityDB";
            statement.executeUpdate(sql);
            System.out.println("Database created successfully...");

            // Use the created database
            statement.executeUpdate("USE CityDB");

            // Create table City
            sql = "CREATE TABLE IF NOT EXISTS City (" +
                  "CityName CHAR(50) PRIMARY KEY, " +
                  "Population DOUBLE)";
            statement.executeUpdate(sql);
            System.out.println("Table created successfully...");

            // Insert records into the table
            String[] cities = {
                "('New York', 8419000)",
                "('Los Angeles', 3980400)",
                "('Chicago', 2716000)",
                "('Houston', 2328000)",
                "('Phoenix', 1690000)"
            };
            for (String city : cities) {
                sql = "INSERT INTO City (CityName, Population) VALUES " + city;
                statement.executeUpdate(sql);
            }
            System.out.println("Records inserted successfully...");

            // Sort the list of cities by population in ascending order
            sql = "SELECT * FROM City ORDER BY Population ASC";
            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println("Cities sorted by population:");
            while (resultSet.next()) {
                String cityName = resultSet.getString("CityName");
                double population = resultSet.getDouble("Population");
                System.out.println("City: " + cityName + ", Population: " + population);
            }

            // Get the total population of all the cities
            sql = "SELECT SUM(Population) AS TotalPopulation FROM City";
            resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                double totalPopulation = resultSet.getDouble("TotalPopulation");
                System.out.println("Total population of all cities: " + totalPopulation);
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

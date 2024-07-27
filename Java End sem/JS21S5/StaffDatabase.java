import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StaffDatabase {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "password"; // Replace with your MySQL root password

        Connection conn = null;
        Statement stmt = null;

        try {
            // Step 1: Connect to MySQL Server
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();

            // Step 2: Create Database Staff
            String createDatabase = "CREATE DATABASE IF NOT EXISTS Staff";
            stmt.executeUpdate(createDatabase);
            System.out.println("Database created successfully...");

            // Step 3: Select the Staff database
            stmt.executeUpdate("USE Staff");

            // Step 4: Create Table Personaldetails
            String createTable = "CREATE TABLE IF NOT EXISTS Personaldetails (" +
                                 "ID INT AUTO_INCREMENT PRIMARY KEY, " +
                                 "Name VARCHAR(100), " +
                                 "Age INT, " +
                                 "Address VARCHAR(200))";
            stmt.executeUpdate(createTable);
            System.out.println("Table created successfully...");

            // Step 5: Insert Records into Personaldetails Table
            String insertData = "INSERT INTO Personaldetails (Name, Age, Address) VALUES " +
                                "('John Doe', 30, '123 Elm St'), " +
                                "('Jane Smith', 25, '456 Oak St'), " +
                                "('Mike Johnson', 35, '789 Pine St')";
            stmt.executeUpdate(insertData);
            System.out.println("Records inserted successfully...");

            // Step 6: Display the Records
            String selectData = "SELECT * FROM Personaldetails";
            ResultSet rs = stmt.executeQuery(selectData);

            System.out.println("ID\tName\t\tAge\tAddress");
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("Name");
                int age = rs.getInt("Age");
                String address = rs.getString("Address");
                System.out.println(id + "\t" + name + "\t" + age + "\t" + address);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

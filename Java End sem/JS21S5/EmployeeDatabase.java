import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDatabase {

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

            // Step 2: Create Database Employee
            String createDatabase = "CREATE DATABASE IF NOT EXISTS Employee";
            stmt.executeUpdate(createDatabase);
            System.out.println("Database created successfully...");

            // Step 3: Use the Employee database
            stmt.executeUpdate("USE Employee");

            // Step 4: Create Employees table
            String createEmployeesTable = "CREATE TABLE IF NOT EXISTS Employees (" +
                                          "ID INT AUTO_INCREMENT PRIMARY KEY, " +
                                          "Name VARCHAR(100), " +
                                          "Department VARCHAR(50), " +
                                          "Salary DECIMAL(10, 2))";
            stmt.executeUpdate(createEmployeesTable);
            System.out.println("Employees table created successfully...");

            // Step 5: Create ContractEmployees table
            String createContractEmployeesTable = "CREATE TABLE IF NOT EXISTS ContractEmployees (" +
                                                  "ID INT AUTO_INCREMENT PRIMARY KEY, " +
                                                  "Name VARCHAR(100), " +
                                                  "HoursWorked INT, " +
                                                  "Salary DECIMAL(10, 2))";
            stmt.executeUpdate(createContractEmployeesTable);
            System.out.println("ContractEmployees table created successfully...");

            // Step 6: Insert records into Employees table
            String insertEmployeesData = "INSERT INTO Employees (Name, Department, Salary) VALUES " +
                                         "('Alice', 'SALES', 50000.00), " +
                                         "('Bob', 'HR', 45000.00), " +
                                         "('Charlie', 'SALES', 55000.00)";
            stmt.executeUpdate(insertEmployeesData);
            System.out.println("Records inserted into Employees table...");

            // Step 7: Insert records into ContractEmployees table
            String insertContractEmployeesData = "INSERT INTO ContractEmployees (Name, HoursWorked, Salary) VALUES " +
                                                 "('Dave', 40, 30000.00), " +
                                                 "('Eve', 25, 25000.00), " +
                                                 "('Frank', 35, 32000.00)";
            stmt.executeUpdate(insertContractEmployeesData);
            System.out.println("Records inserted into ContractEmployees table...");

            // Step 8: Select all employees working in the SALES department
            System.out.println("Employees in SALES department:");
            String query1 = "SELECT * FROM Employees WHERE Department = 'SALES'";
            ResultSet rs1 = stmt.executeQuery(query1);
            while (rs1.next()) {
                int id = rs1.getInt("ID");
                String name = rs1.getString("Name");
                String department = rs1.getString("Department");
                double salary = rs1.getDouble("Salary");
                System.out.println(id + "\t" + name + "\t" + department + "\t" + salary);
            }

            // Step 9: Select ContractEmployees working over 30 hours
            System.out.println("\nContractEmployees working over 30 hours:");
            String query2 = "SELECT * FROM ContractEmployees WHERE HoursWorked > 30";
            ResultSet rs2 = stmt.executeQuery(query2);
            while (rs2.next()) {
                int id = rs2.getInt("ID");
                String name = rs2.getString("Name");
                int hoursWorked = rs2.getInt("HoursWorked");
                double salary = rs2.getDouble("Salary");
                System.out.println(id + "\t" + name + "\t" + hoursWorked + "\t" + salary);
            }

            // Step 10: Select all ContractEmployees in descending order of the salary
            System.out.println("\nContractEmployees in descending order of salary:");
            String query3 = "SELECT * FROM ContractEmployees ORDER BY Salary DESC";
            ResultSet rs3 = stmt.executeQuery(query3);
            while (rs3.next()) {
                int id = rs3.getInt("ID");
                String name = rs3.getString("Name");
                int hoursWorked = rs3.getInt("HoursWorked");
                double salary = rs3.getDouble("Salary");
                System.out.println(id + "\t" + name + "\t" + hoursWorked + "\t" + salary);
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

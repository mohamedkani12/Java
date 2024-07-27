package JS22S6;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Define the Student class
class Student implements Serializable {
    
    private String name;
    private int age;
    private double cgpa;
    private int rollNumber;

    public Student(String name, int age, double cgpa, int rollNumber) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", CGPA: " + cgpa + ", Roll Number: " + rollNumber;
    }
}

public class StudentSerialization {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Get student details from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student details (name, age, CGPA, roll number), type 'exit' to finish:");

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) break;

            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("CGPA: ");
            double cgpa = Double.parseDouble(scanner.nextLine());

            System.out.print("Roll Number: ");
            int rollNumber = Integer.parseInt(scanner.nextLine());

            Student student = new Student(name, age, cgpa, rollNumber);
            students.add(student);
        }

        // Write student details to a file using object serialization
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("students.text"))) {
            for (Student student : students) {
                outputStream.writeObject(student);
            }
            System.out.println("Student details written to file 'students.text'");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read student details from the file using object deserialization
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("students.text"))) {
            System.out.println("Reading student details from file 'students.text':");
            Object obj;
            while ((obj = inputStream.readObject()) != null) {
                if (obj instanceof Student) {
                    Student student = (Student) obj;
                    System.out.println(student);
                }
            }
        } catch (EOFException e) {
            // End of file reached
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

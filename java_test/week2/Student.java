package week2;
import java.util.*;
public class Student {
  private int roll_no;
  private double cgpa;
  private String name;
  private static int noOfCourseEnroll;
  public Student(int rno,double cgpa, String name) {
    this.roll_no=rno;  
    this.cgpa = cgpa;
    this.name = name;
}
  private static int numberOfCourseEnrolled(){
    return noOfCourseEnroll;
  }
  private static void enrollCourse(int n){
    noOfCourseEnroll+=n;
  }
  private static void dropCourse(int n){
    System.out.println("Dropped Course : "+n);
    noOfCourseEnroll-=n;
  }
  private void calculateGpa(double[] grades){
    double totalgradePoints=0.0;
    for(double grade : grades){
      totalgradePoints+=grade;
    }
    this.cgpa = totalgradePoints / grades.length;
  }
  public String toString() {
    return "Student Details: \n" +
            "Roll No: " + roll_no + "\n" +
            "Name: " + name + "\n" +
            "CGPA: " + cgpa + "\n" +
            "Number of Courses Enrolled: " + noOfCourseEnroll + "\n";
  }
  public static void main(String[] args) {
    Student s1=new Student(3303,0.0,"Mohamed kani");
    System.out.println(s1.toString());
    Scanner in = new Scanner(System.in);
    System.out.println("How many course Enroll : ");
    int n = in.nextInt();
    enrollCourse(n);
    System.out.println("Enter "+n+"subject grade points : ");
    double[] grades=new double[n];
    for(int i=0 ; i<n ; i++){
      grades[i]=in.nextInt();
    }
    s1.calculateGpa(grades);
    dropCourse(2);
    System.out.println("number of Course Enrolled : "+Student.noOfCourseEnroll);
    System.out.println(s1.toString());
  }
}

package week2;
public class Course {
  private String courseName;
  private String courseInstructor;
  private int noofHours;
  private int noofCredits;
  private static int noofStudentsEnrolled;

  // Default constructor
  public Course() {
      this.courseName = "";
      this.courseInstructor = "";
      this.noofHours = 0;
      this.noofCredits = 0;
  }

  // Constructor with arguments
  public Course(String courseName, String courseInstructor, int noofHours, int noofCredits) {
      this.courseName = courseName;
      this.courseInstructor = courseInstructor;
      this.noofHours = noofHours;
      this.noofCredits = noofCredits;
  }

  // toString() method
  public String toString() {
      return "Course Name: " + courseName + "\n" +
              "Course Instructor: " + courseInstructor + "\n" +
              "Number of Hours: " + noofHours + "\n" +
              "Number of Credits: " + noofCredits + "\n" +
              "Number of Students Enrolled: " + noofStudentsEnrolled + "\n";
  }

  // Getters and Setters
  public String getCourseName() {
      return courseName;
  }

  public void setCourseName(String courseName) {
      this.courseName = courseName;
  }

  public String getCourseInstructor() {
      return courseInstructor;
  }

  public void setCourseInstructor(String courseInstructor) {
      this.courseInstructor = courseInstructor;
  }

  public int getNoofHours() {
      return noofHours;
  }

  public void setNoofHours(int noofHours) {
      this.noofHours = noofHours;
  }

  public int getNoofCredits() {
      return noofCredits;
  }

  public void setNoofCredits(int noofCredits) {
      this.noofCredits = noofCredits;
  }

  // Static method to enroll students
  public static void enroll(int n) {
      noofStudentsEnrolled += n;
  }

  // Static method to drop students
  public static void drop(int n) {
      noofStudentsEnrolled -= n;
  }

  public static void main(String[] args) {
      // Creating objects of Course and testing methods
      Course course1 = new Course("Mathematics", "Dr. Smith", 4, 3);
      Course course2 = new Course("English", "Ms. Johnson", 3, 2);

      System.out.println("Before enrollment:");
      System.out.println(course1.toString());
      System.out.println(course2.toString());

      Course.enroll(20); // Enrolling 20 students
      Course.drop(5);    // Dropping 5 students

      System.out.println("After enrollment:");
      System.out.println(course1.toString());
      System.out.println(course2.toString());
  }
}

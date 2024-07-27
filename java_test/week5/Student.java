package week5;
public class Student extends Person{

  private int rollno;
  private double cgpa;
  private String university;
  public static int numStudentsEnrolled = 0;

  Student(){
    super();
  }

  Student(String firstName,
    String lastName,
    int age,
    String emailID,
    int rollno,
    double cgpa,
    String university){
    super(firstName, lastName, age, emailID);
    this.rollno = rollno;
    this.cgpa = cgpa;
    this.university = university;
  }

  public String getUniversity(){
    return this.university;
  }


  public int getRollNo() {
    return this.rollno;
  }

  public double getCGPA() {
    return this.cgpa;
  }

  @Override
  public String toString() {
    return super.toString() + String.format("Roll No. : %d\nCGPA : %f\nUniversity : %s\n\n", this.rollno, this.cgpa, this.university);
  }


  @Override
  public boolean validateEmail(){
    return super.emailID.equals(super.firstName.substring(0,4)+super.lastName.substring(0,4)+"@"+this.university+".edu");
  }

  public void setUniversity(String university) {
    this.university = university;
  }

  public void setRollNo(int newRollNo) {
    this.rollno = newRollNo;
  }

  public void setCGPA(double newCGPA) {
    this.cgpa = newCGPA;
  }

  public static void setNumStudentsEnrolled(int nStudentsEnrolled) {
    numStudentsEnrolled = nStudentsEnrolled;
  }
}
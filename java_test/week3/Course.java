package week3;
public class Course {
  private String courseName;
  private String courseInstructor;
  private int noOfhour;
  private int noOfCredit;
  private int grade;
  public Course()
  {
    courseName=null;
    courseInstructor=null;
    noOfhour=0;
    noOfCredit=0;
    grade=0;
  }
  public Course(String cn,String ci,int h,int c,int gr)
  {
    courseName=cn;
    courseInstructor=ci;
    noOfhour=h;
    noOfCredit=c;
    grade=gr;
  }
  public void setName(String n)
  {
    courseName=n;
  }
  public String getName()
  {
    return courseName;
  }
  public void setInstructor(String n)
  {
    courseInstructor=n;
  }
  public String getInstructor()
  {
    return courseInstructor;
  }
  public void setHour(int n)
  {
    noOfhour=n;
  }
  public int getHour()
  {
    return noOfhour;
  }
  public void setCredit(int n)
  {
    noOfCredit=n;
  }
  public int getCredit()
  {
    return noOfCredit;
  }
  public void setGrade(int s)
  {
    this.grade=s;
  }
  public int getGrade()
  {
    return grade;
  }
  public String toString() {
    return "Course Details: \n" +
      "Course Name: " + courseName + "\n" +
      "Instructor: " + courseInstructor + "\n" +
      "Hours: " + noOfhour + "\n" +
      "Credits: " + noOfCredit + "\n"+
      "Grade: "+grade;
  }
  public void display()
  {
    System.out.println( "course name:"+ courseName
      + " Instructor:"+ courseInstructor + " Contact hr:"+ noOfhour + " Credit:"+ noOfCredit+ " Grade:"+ grade);
  }
}
package week3;
public class Student {
  private String name;
  private int rollNo;
  private double cgpa;
  private int noOfCourse;
  private Course[] courseEnrolled;
  public Student()
  {
    name=null;
    rollNo=0;
    cgpa=0.0;
    noOfCourse=0;
    courseEnrolled=new Course[5];
  }

  public Student(String nm,int rn)
  {
    name=nm;
    rollNo=rn;
    cgpa=0.0;
    noOfCourse=0;
    courseEnrolled=new Course[5];
  }

  public void setName(String s)
  {
    name=s;
  }

  public String getName()
  {
    return name;
  }

  public void setRoll(int s)
  {
    rollNo=s;
  }
  public int getRoll()
  {
    return rollNo;
  }


  public int getNoOfCourse()
  {
    return  noOfCourse;
  }

  public void addCourse(Course c1)
  {
    courseEnrolled[noOfCourse++]=c1;
  }

  public void dropCourse(Course c1)
  {
    int i=0;
    for(i=0; i<noOfCourse; i++)
    {
      if(courseEnrolled[i]!=null && courseEnrolled[i].getName().equals(c1.getName()))
      {
        courseEnrolled[i]=null;
        break;
      }
    }
    if(i==noOfCourse)
    {
      System.out.println("Course not found");
    }
  }

  public double calculateCgpa()
  {
    double s=0.0,cs=0.0;
    for(int i=0; i<noOfCourse; i++)
    {
      if(courseEnrolled[i]!=null) {
        s+=courseEnrolled[i].getGrade() *courseEnrolled[i].getCredit();
        cs+=courseEnrolled[i].getCredit();
      }
    }
    cgpa=s/cs;
    return cgpa;
  }
 public String toString() {
    return String.format("Name: %s, Roll: %d", name, rollNo);
}

}
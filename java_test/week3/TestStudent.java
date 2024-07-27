package week3;
import java.util.*;
public class TestStudent {
  public static void main(String[] args) {
    Course course1= new Course("Discrete Mathematics","Amutha R",4,3,10);
    Course course2= new Course("Operating Systems","GSM",6,7,8);
    Student s1 = new Student("Mohamed",3303);
    System.out.println(s1.toString());
    s1.addCourse(course1);
    s1.addCourse(course2);
    System.out.println(s1.calculateCgpa());
    
  }
}

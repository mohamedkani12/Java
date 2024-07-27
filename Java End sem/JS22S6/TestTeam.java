package JS22S6;

public class TestTeam {
  public static void main(String[] args) {
      Team team = new Team();

      // Adding students to the team
      team.addStudent("Alice", "10th Grade", 85, 90, 78);
      team.addStudent("Bob", "10th Grade", 80, 70, 88);
      team.addStudent("Charlie", "10th Grade", 90, 95, 80);
      team.addStudent("Diana", "10th Grade", 75, 85, 85);
      team.addStudent("Eve", "10th Grade", 88, 60, 78);

      // Print student details
      team.printStudentDetails();

      // Find the student with the least points in event 2
      Student leastScoreStudent = team.findStudentWithLeastPointsInEvent2();
      if (leastScoreStudent != null) {
          System.out.println("Student with the least points in Event 2:");
          System.out.println("Name: " + leastScoreStudent.getStudentName());
          System.out.println("Register Number: " + leastScoreStudent.getRegisterNumber());
          System.out.println("Class: " + leastScoreStudent.getStudentClass());
          System.out.println("Event 2 Score: " + leastScoreStudent.getEvent2Score());
      } else {
          System.out.println("No students found.");
      }
  }
}


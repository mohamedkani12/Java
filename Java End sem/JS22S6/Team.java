package JS22S6;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Student> students;

    public Team() {
        students = new ArrayList<>();
    }

    public void addStudent(String studentName, String studentClass, int event1Score, int event2Score, int event3Score) {
        Student newStudent = new Student(studentName, studentClass, event1Score, event2Score, event3Score);
        students.add(newStudent);
    }

    public void printStudentDetails() {
        for (Student student : students) {
            System.out.println("Name: " + student.getStudentName());
            System.out.println("Register Number: " + student.getRegisterNumber());
            System.out.println("Class: " + student.getStudentClass());
            System.out.println("Event 1 Score: " + student.getEvent1Score());
            System.out.println("Event 2 Score: " + student.getEvent2Score());
            System.out.println("Event 3 Score: " + student.getEvent3Score());
            System.out.println("Total Score: " + student.getTotalScore());
            System.out.println();
        }
    }

    public Student findStudentWithLeastPointsInEvent2() {
        if (students.isEmpty()) {
            return null;
        }

        Student leastScoreStudent = students.get(0);
        for (Student student : students) {
            if (student.getEvent2Score() < leastScoreStudent.getEvent2Score()) {
                leastScoreStudent = student;
            }
        }
        return leastScoreStudent;
    }
}

package JS22S6;
public class Student {
  private static int registerCounter = 1000; // Starting RegisterNumber from 1000
  private String studentName;
  private int registerNumber;
  private String studentClass;
  private int event1Score;
  private int event2Score;
  private int event3Score;

  public Student(String studentName, String studentClass, int event1Score, int event2Score, int event3Score) {
      this.studentName = studentName;
      this.registerNumber = registerCounter++;
      this.studentClass = studentClass;
      this.event1Score = event1Score;
      this.event2Score = event2Score;
      this.event3Score = event3Score;
  }

  public String getStudentName() {
      return studentName;
  }

  public int getRegisterNumber() {
      return registerNumber;
  }

  public String getStudentClass() {
      return studentClass;
  }

  public int getEvent1Score() {
      return event1Score;
  }

  public int getEvent2Score() {
      return event2Score;
  }

  public int getEvent3Score() {
      return event3Score;
  }

  public int getTotalScore() {
      return event1Score + event2Score + event3Score;
  }
}

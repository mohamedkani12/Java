public class Elevator {
  private int numberOfPersons;
  private final int maxAllowed;

  public Elevator() {
      numberOfPersons = 0;
      maxAllowed = 20;
  }

  public void push(int value) throws ElevatorException {
      if (numberOfPersons + value > maxAllowed || numberOfPersons + value < 0) {
          throw new ElevatorException("Invalid number of persons in elevator");
      }
      numberOfPersons += value;
  }

  public void pop(int value) throws ElevatorException {
      push(-value);
  }

  public int getNumberOfPersons() {
      return numberOfPersons;
  }

  public int getMaxAllowed() {
      return maxAllowed;
  }

  public static class ElevatorException extends Exception {
      public ElevatorException(String message) {
          super(message);
      }
  }
  public static void main(String[] args) {
    Elevator elevator = new Elevator();

    try {
        elevator.push(10); // Add 10 persons
        System.out.println("Number of persons: " + elevator.getNumberOfPersons());
        elevator.pop(5); // Remove 5 persons
        System.out.println("Number of persons: " + elevator.getNumberOfPersons());
        elevator.push(20); // This will throw an exception because maxAllowed is 20
    } catch (Elevator.ElevatorException e) {
        System.out.println("Error: " + e.getMessage());
    }
} 
}

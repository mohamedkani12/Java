class Salesperson {
  private int age;
  private String name;
  private int numberOfSales;
  private double salary;

  // Constructor with three arguments to initialize age, name, and salary
  // Number of sales is always initialized to zero
  public Salesperson(int age, String name, double salary) {
      this.age = age;
      this.name = name;
      this.salary = salary;
      this.numberOfSales = 0; // always initialized to zero
  }

  // Method to increment the number of sales for the amount of sale made
  public void addSale(double saleAmount) {
      numberOfSales++;
      // Optionally, you can handle saleAmount if you want to track it as well
  }

  // Method to return the sales made by the Salesperson
  public int getSales() {
      return numberOfSales;
  }

  // Method to display the details of the Salesperson
  public void display() {
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Salary: $" + salary);
      System.out.println("Number of Sales: " + numberOfSales);
      System.out.println("Bonus: $" + getBonus());
  }

  // Method to return the bonus of the Salesperson based on the sales range
  public double getBonus() {
      if (numberOfSales > 40) {
          return 5000;
      } else if (numberOfSales >= 20) {
          return 2000;
      } else if (numberOfSales >= 10) {
          return 1000;
      } else {
          return 0;
      }
  }
}

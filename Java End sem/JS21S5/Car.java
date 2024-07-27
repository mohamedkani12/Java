class Car extends Vehicle {
  private double mileage;
  private int year;

  // Constructor to initialize data members and call superclass constructor
  public Car(int vehicleNumber, String brand, String model, double vehicleCost, double mileage, int year) {
      super(vehicleNumber, brand, model, vehicleCost);
      this.mileage = mileage;
      this.year = year;
  }

  // Override rent method to increment number of rentals
  @Override
  public void rent() {
      numberOfRentals++;
  }

  // Getters for mileage and year
  public double getMileage() {
      return mileage;
  }

  public int getYear() {
      return year;
  }

  // Display details of the Car
  public void display() {
      System.out.println("Vehicle Number: " + vehicleNumber);
      System.out.println("Brand: " + brand);
      System.out.println("Model: " + model);
      System.out.println("Vehicle Cost: $" + vehicleCost);
      System.out.println("Mileage: " + mileage + " km/l");
      System.out.println("Year: " + year);
      System.out.println("Number of Rentals: " + numberOfRentals);
  }
  public static void main(String[] args) {
    //Vehicle vehicle = new Car(0, null, null, 0, 0, 0);
  }
}

abstract class Vehicle {
  protected int vehicleNumber;
  protected String brand;
  protected String model;
  protected double vehicleCost;
  protected int numberOfRentals;

  // Constructor to initialize data members
  public Vehicle(int vehicleNumber, String brand, String model, double vehicleCost) {
      this.vehicleNumber = vehicleNumber;
      this.brand = brand;
      this.model = model;
      this.vehicleCost = vehicleCost;
      this.numberOfRentals = 0; // initialized to zero
  }

  // Abstract method to be implemented by subclasses
  public abstract void rent();
}

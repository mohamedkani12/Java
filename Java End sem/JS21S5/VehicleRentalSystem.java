public class VehicleRentalSystem implements Analysable {
  public static void main(String[] args) {
      // Create an array of Vehicles to store Car objects
      Car[] cars = new Car[3];
      cars[0] = new Car(101, "Toyota", "Camry", 30000, 15, 2019);
      cars[1] = new Car(102, "Honda", "Accord", 28000, 14, 2020);
      cars[2] = new Car(103, "Ford", "Fusion", 27000, 13, 2018);

      // Simulate renting cars
      cars[0].rent();
      cars[0].rent();
      cars[1].rent();
      cars[2].rent();
      cars[2].rent();
      cars[2].rent();

      // Display the details of each car
      for (Car car : cars) {
          car.display();
          System.out.println();
      }

      // Create an instance of VehicleRentalSystem to use findMaxRentedCar
      VehicleRentalSystem system = new VehicleRentalSystem();
      Car maxRentedCar = system.findMaxRentedCar(cars);

      // Display the details of the most rented car
      System.out.println("The car that has been rented the maximum number of times:");
      maxRentedCar.display();
  }

  // Implementation of findMaxRentedCar method from Analysable interface
  @Override
  public Car findMaxRentedCar(Car[] cars) {
      if (cars == null || cars.length == 0) {
          return null;
      }

      Car maxRentedCar = cars[0];
      for (Car car : cars) {
          if (car.numberOfRentals > maxRentedCar.numberOfRentals) {
              maxRentedCar = car;
          }
      }
      return maxRentedCar;
  }
}

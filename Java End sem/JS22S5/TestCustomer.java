package JS22S5;
// Person class
class Person {
  private String name;
  private String address;
  private String telephoneNumber;

  // Constructor with arguments
  public Person(String name, String address, String telephoneNumber) {
      this.name = name;
      this.address = address;
      this.telephoneNumber = telephoneNumber;
  }

  // Getters and setters
  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public String getAddress() {
      return address;
  }

  public void setAddress(String address) {
      this.address = address;
  }

  public String getTelephoneNumber() {
      return telephoneNumber;
  }

  public void setTelephoneNumber(String telephoneNumber) {
      this.telephoneNumber = telephoneNumber;
  }
}

// Customer class extending Person
class Customer extends Person {
  private int customerNumber;
  private boolean onMailingList;

  // Constructor with arguments
  public Customer(String name, String address, String telephoneNumber, int customerNumber, boolean onMailingList) {
      super(name, address, telephoneNumber);
      this.customerNumber = customerNumber;
      this.onMailingList = onMailingList;
  }

  // Getters and setters specific to Customer class
  public int getCustomerNumber() {
      return customerNumber;
  }

  public void setCustomerNumber(int customerNumber) {
      this.customerNumber = customerNumber;
  }

  public boolean isOnMailingList() {
      return onMailingList;
  }

  public void setOnMailingList(boolean onMailingList) {
      this.onMailingList = onMailingList;
  }
}

// PreferredCustomer class extending Customer
class PreferredCustomer extends Customer {
  private double purchasesAmount;
  private int discountLevel;

  // Constructor with arguments
  public PreferredCustomer(String name, String address, String telephoneNumber, int customerNumber,
          boolean onMailingList, double purchasesAmount, int discountLevel) {
      super(name, address, telephoneNumber, customerNumber, onMailingList);
      this.purchasesAmount = purchasesAmount;
      this.discountLevel = discountLevel;
  }

  // Method to update discount level based on purchases
  public void updateDiscountLevel() {
      if (purchasesAmount >= 2000) {
          discountLevel = 10;
      } else if (purchasesAmount >= 1000) {
          discountLevel = 7;
      } else {
          discountLevel = 0; // No discount
      }
  }

  // Getters and setters specific to PreferredCustomer class
  public double getPurchasesAmount() {
      return purchasesAmount;
  }

  public void setPurchasesAmount(double purchasesAmount) {
      this.purchasesAmount = purchasesAmount;
      updateDiscountLevel(); // Update discount level when purchases amount changes
  }

  public int getDiscountLevel() {
      return discountLevel;
  }

  public void setDiscountLevel(int discountLevel) {
      this.discountLevel = discountLevel;
  }
}

// Test program to create objects and invoke methods
public class TestCustomer {
  public static void main(String[] args) {
      // Create a PreferredCustomer object
      PreferredCustomer customer1 = new PreferredCustomer("John Doe", "123 Main St", "123-456-7890", 1001, true,
              500.0, 0);

      // Display customer information
      System.out.println("Customer Name: " + customer1.getName());
      System.out.println("Customer Address: " + customer1.getAddress());
      System.out.println("Customer Telephone: " + customer1.getTelephoneNumber());
      System.out.println("Customer Number: " + customer1.getCustomerNumber());
      System.out.println("On Mailing List: " + customer1.isOnMailingList());
      System.out.println("Purchases Amount: Rs " + customer1.getPurchasesAmount());
      System.out.println("Discount Level: " + customer1.getDiscountLevel() + "%");

      // Update purchases amount and display updated discount level
      customer1.setPurchasesAmount(2200.0);
      System.out.println("Updated Purchases Amount: Rs " + customer1.getPurchasesAmount());
      System.out.println("Updated Discount Level: " + customer1.getDiscountLevel() + "%");
  }
}

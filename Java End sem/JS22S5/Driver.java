package JS22S5;

// Abstract class Asset
abstract class Asset {
  protected int serialNumber;
  protected double assetCost;
  protected double insuredAmount;

  public Asset(int serialNumber, double assetCost) {
      this.serialNumber = serialNumber;
      this.assetCost = assetCost;
      this.insuredAmount = 0; // Initial insured amount is set to zero
  }

  //public abstract void takeInsurance(); // Abstract method for taking insurance

  public double getAssetCost() {
      return assetCost;
  }

  public double getInsuredAmount() {
      return insuredAmount;
  }

  public String toString() {
      return "Serial Number: " + serialNumber + ", Asset Cost: " + assetCost + ", Insured Amount: " + insuredAmount;
  }
}

// Interface Insurance
interface Insurance {
  void takeInsurance();
}

// Derived class ElectronicAppliances from Asset implementing Insurance
class ElectronicAppliances extends Asset implements Insurance {
  private String brand;
  private int modelNo;
  private String type;
  private boolean amc;
  private double amcAmount;

  public ElectronicAppliances(int serialNumber, double assetCost, String brand, int modelNo, String type) {
      super(serialNumber, assetCost);
      this.brand = brand;
      this.modelNo = modelNo;
      this.type = type;
      this.amc = false; // Initial AMC status is set to false
      this.amcAmount = 0; // Initial AMC amount is set to zero
  }

  public void setAMC() {
      amc = true; // Set AMC status to true
  }

  public boolean getAMCDetails() {
      return amc;
  }

  public void setAMCAmount(double amount) {
      amcAmount = amount;
  }

  public void renewAMC(double newAmount) {
      amcAmount = newAmount;
      amc = true; // Set AMC status to true after renewal
  }

  public void takeInsurance() {
      insuredAmount = 0.25 * assetCost; // Set insured amount as 25% of asset cost
  }

  public String toString() {
      return super.toString() + ", Brand: " + brand + ", Model No: " + modelNo + ", Type: " + type
              + ", AMC: " + amc + ", AMC Amount: " + amcAmount;
  }
}

// Driver class to test functionalities
public class Driver {
  public static void main(String[] args) {
      ElectronicAppliances appliance = new ElectronicAppliances(101, 500.0, "Sony", 1234, "TV");
      System.out.println("Before taking insurance:");
      System.out.println(appliance);

      appliance.takeInsurance();
      System.out.println("\nAfter taking insurance:");
      System.out.println(appliance);

      appliance.setAMC();
      appliance.setAMCAmount(100.0);
      System.out.println("\nAfter setting AMC details:");
      System.out.println(appliance);

      appliance.renewAMC(150.0);
      System.out.println("\nAfter renewing AMC:");
      System.out.println(appliance);
  }
}


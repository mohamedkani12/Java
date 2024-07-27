package week5;

public class Address {

  private String streetName;
  private String city;
  private int pincode;

  Address(String streetName, String city, int pincode){
    this.streetName = streetName;
    this.city = city;
    this.pincode = pincode;
  }

  public String getStreetName() {
    return this.streetName;
  }

  public String getCity() {
    return this.city;
  }

  public int getPincode() {
    return this.pincode;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public void setPincode(int pincode) {
    this.pincode = pincode;
  }


  public void modifyAddress(String streetName, String city, int pincode) {
    //Scanner in = new Scanner(System.in);
    //System.out.println("Enter ");
    this.setStreetName(streetName);
    this.setCity(city);
    this.setPincode(pincode);
  }

  public void display() {
    System.out.println(this.toString());
  }

  public String toString() {
    return String.format("StreetName : %s\nCity : %s\nPincode : %d\n\n", this.streetName, this.city, this.pincode);
  }

}

package week5;
public abstract class Person {
  protected String firstName;
  protected String lastName;
  protected int age;
  protected String emailID;
  private Address currAddress;
  Person(){
    this("","",0,"");
  }
  Person(String firstName, String lastName, int age, String emailID){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.emailID = emailID;
  }
  public String getFirstName() {
    return this.firstName;
}


public String getLastName() {
    return this.lastName;
}

public int getAge() {
    return this.age;
}

public String getEmailID() {
    return this.emailID;
}

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setEmailID(String emailID) {
    this.emailID = emailID;
  }
  public abstract boolean validateEmail();
  public void modifyAddress(Address newAdrress){
    this.currAddress = newAdrress;
  }
}

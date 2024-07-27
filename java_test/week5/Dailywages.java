package week5;
package week5;

public class DailyWages extends Person{

  private double wagesPerHour;
  private int numHours;


  DailyWages(){
          super();
  }

  DailyWages(String firstName,
                     String lastName,
                     int age,
                     double wagesPerHour, int numHours){
          super(firstName, lastName, age, "");
          this.wagesPerHour = wagesPerHour;
          this.numHours = numHours;
  }

  public double getWagesPerHour(){
          return this.wagesPerHour;
  }

  public int getNumHours(){
          return this.numHours;
  }

  public void setWagesPerHour(double wagesPerHour){
          this.wagesPerHour = wagesPerHour;
  }

  public void setNumHours(int numHours){
          this.numHours = numHours;
  }

  public double calculateWage(){
          return this.wagesPerHour * this.numHours;
  }

  @Override
  public boolean validateEmail(){
          return false;
  }

}
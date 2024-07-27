package week5;
public class SalesPerson extends Person{

  private double salarypm;
  private int totalSales;
  private int empID;
  private String companyName;
  public static double festivalBonus;

  public SalesPerson(){
          super();
  }

  //private
  SalesPerson(String firstName,
                String lastName,
                int age,
                String emailID,
                double salarypm,
        int totalSales,
                int empID,
                String companyName){
          super(firstName, lastName, age, emailID);
          this.salarypm = salarypm;
          this.totalSales = totalSales;
          this.empID = empID;
          this.companyName = companyName;

  }



  public double getSalarypm(){
          return this.salarypm;
  }

  public int getTotalSales(){
          return this.totalSales;
  }

  public int getEmpID(){
          return this.empID;
  }

  public String getCompanyName(){
          return this.companyName;
  }

  public void setSalarypm(double salarypm){
          this.salarypm = salarypm;
  }


  public void setTotalSales(int totalSales){
          this.totalSales = totalSales;
  }

  public void setEmpId(int empID){
          this.empID = empID;
  }

  public void setCompanyName(String companyName){
          this.companyName = companyName;
  }

  public static double getFest(){
          return festivalBonus;
  }

  public static void setFest(double festBonus){
          festivalBonus = festBonus;
  }

  public double getBonus(){
          if(this.totalSales >= 10 && this.totalSales < 20){
                  return 1000;
          }else if(this.totalSales >= 20 && this.totalSales < 40){
                  return 2000;
          }else if(this.totalSales >= 40){
                  return 5000;
          }

          return 0;
  }

  public double calSal(){
        return this.salarypm * 12 + this.getBonus() + festivalBonus;
  }

  @Override
  public String toString() {
        return super.toString() + String.format("Salary (pm) : %f\nTotal Sales : %d\nEmp ID : %d\nCompany Name : %s\n\n", this.salarypm, this.totalSales, this.empID, this.companyName);
  }


  @Override
  public boolean validateEmail(){
          return super.emailID.equals(super.firstName + this.empID + "@" + this.companyName + ".com");
  }
}
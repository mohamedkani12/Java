package week4;
public class SalesPerson {
  int age;
  String name;
  int no_of_sales;
  double salary;
  Date doj =new Date();
  public SalesPerson(int a,String nm,double s){
    age = a;
    name = nm;
    salary = s;
    no_of_sales = 0;
  }
  public void addSale(double saleAmont){
    no_of_sales++;
  }
  public int getSales(){
    return no_of_sales;
  }
  public double getBonus(){
    if(no_of_sales>=10 && no_of_sales<=20)
      return 1000.0;
    if(no_of_sales>20 && no_of_sales<=40){
       return 2000.0;
    }
    if(no_of_sales>40){
      return 5000.0;
    }else {
      return 0;
    }
  }
  public double getSalary(){
    return salary;
  }
  public void display(){
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Number of Sales: " + no_of_sales);
    System.out.println("Salary: $" + salary);
    System.out.println("Year of joining: "+doj.year);
  }
}

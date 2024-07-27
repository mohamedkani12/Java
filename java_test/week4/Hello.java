package week4;
import java.util.*;
public class Hello{
 static int fbonus = 2000;
 public static void main(String[] args) {
  SalesPerson p1 = new SalesPerson(20,"Mohamed",5000);
  p1.doj = new Date(10,12,2022);
  int i;
  for(i=0;i<50;i++){
    p1.addSale(i);
  }
  double bs = p1.salary * 12;
  p1.display();
  int ye = p1.doj.getYears(p1.doj);
  double bonus = p1.getBonus();
  bs+=bonus;
  bs+=fbonus;
  System.out.println("Bonus for "+p1.name+" is: "+bonus);
  System.out.println("Years of experience for "+p1.name+" is: "+ye);
  System.out.println("Total Salary of "+p1.name+ " is: "+bs);
  System.out.println(p1.doj.toString());
}
}
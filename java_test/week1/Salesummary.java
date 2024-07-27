package week1;
import java.util.*;
public class Salesummary {
  public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int[][] sales = new int[4][5];
    for(int i=0;i<4;i++){
      for(int j=0;j<5;j++)
      {
        System.out.println("Enter salesperson"+(i+1)+" & Product"+(j+1)+":");
        sales[i][j]=in.nextInt();
      }
    }
    System.out.printf("%-15s","SalesPerson");
    for(int i=1;i<=5;i++){
      System.out.printf("%-15s","Product"+i);
    }
    System.out.printf("%-15s%n","Total");
    int[] productTotal = new int[5];
    for(int i=0;i<4;i++){
      int salespersonTotal=0;
      System.out.printf("%-15s","Person"+(i+1));
      for(int j=0;j<5;j++)
      {
        System.out.printf("%-15d",sales[i][j]);
        salespersonTotal+=sales[i][j];
        productTotal[j]+=sales[i][j];
      }
      System.out.printf("%-15d%n",salespersonTotal);
    }
    System.out.printf("%-15s","Total");
    for(int total : productTotal)
    {
      System.out.printf("%-15d",total);
    }
    in.close();
  }
}

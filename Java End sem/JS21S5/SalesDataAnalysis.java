/*
 1..Declare a 2D array called Sales which can hold sales data
of three stores for each of 12 months. Assume the sales
data to be of type double. Print the following information:
i. To find the store which made the
least sales across a year
ii. To find the month in which highest
sales done for the third store.
 */
public class SalesDataAnalysis {

  public static void main(String[] args) {
      // Declare a 2D array called Sales to hold sales data of three stores for each of 12 months
      double[][] sales = {
          {1200.50, 1300.75, 1400.60, 1500.80, 1600.90, 1700.20, 1800.30, 1900.45, 2000.55, 2100.65, 2200.75, 2300.85},
          {1100.50, 1200.65, 1300.75, 1400.85, 1500.95, 1600.15, 1700.25, 1800.35, 1900.45, 2000.55, 2100.65, 2200.75},
          {2200.45, 1150.55, 1250.65, 1350.75, 1450.85, 1550.95, 1650.05, 1750.15, 1850.25, 1950.35, 2050.45, 2150.55}
      };

      // Find the store which made the least sales across a year
      int leastSalesStore = findStoreWithLeastSales(sales);
      System.out.println("The store with the least sales across the year is Store " + (leastSalesStore + 1));

      // Find the month in which highest sales were done for the third store
      int highestSalesMonth = findMonthWithHighestSalesForThirdStore(sales);
      System.out.println("The month with the highest sales for the third store is Month " + (highestSalesMonth + 1));
  }

  // Method to find the store which made the least sales across a year
  public static int findStoreWithLeastSales(double[][] sales) {
      double[] totalSalesPerStore = new double[sales.length];
      for (int i = 0; i < sales.length; i++) {
          for (int j = 0; j < sales[i].length; j++) {
              totalSalesPerStore[i] += sales[i][j];
          }
      }

      int leastSalesStore = 0;
      double leastSales = totalSalesPerStore[0];
      for (int i = 1; i < totalSalesPerStore.length; i++) {
          if (totalSalesPerStore[i] < leastSales) {
              leastSales = totalSalesPerStore[i];
              leastSalesStore = i;
          }
      }
      return leastSalesStore;
  }

  // Method to find the month in which highest sales were done for the third store
  public static int findMonthWithHighestSalesForThirdStore(double[][] sales) {
      int storeIndex = 2; // Third store index (0-based)
      int highestSalesMonth = 0;
      double highestSales = sales[storeIndex][0];
      for (int j = 1; j < sales[storeIndex].length; j++) {
          if (sales[storeIndex][j] > highestSales) {
              highestSales = sales[storeIndex][j];
              highestSalesMonth = j;
          }
      }
      return highestSalesMonth;
  }
}

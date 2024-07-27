package JS22S6;
public class EmployeeHours {
  public static void main(String[] args) {
      // Initialize the 2D array with sample data (5 employees, 7 days)
      int[][] hoursWorked = {
          {8, 9, 7, 5, 6, 8, 7}, // Employee 1
          {7, 8, 9, 6, 5, 9, 8}, // Employee 2
          {6, 7, 8, 9, 7, 6, 5}, // Employee 3
          {9, 6, 7, 8, 9, 5, 6}, // Employee 4
          {5, 8, 6, 7, 8, 9, 7}  // Employee 5
      };

      // Given days (indices, assuming days start from 0)
      int day1 = 2; // Day 3
      int day2 = 4; // Day 5

      // Find the employee who worked the longest on the two given days
      int longestWorkingEmployee = findLongestWorkingEmployee(hoursWorked, day1, day2);
      System.out.println("Employee who worked the longest on day " + (day1 + 1) + " and day " + (day2 + 1) + ": Employee " + (longestWorkingEmployee + 1));

      // Find the day with maximum hours worked by all employees
      int dayWithMaxHours = findDayWithMaxHours(hoursWorked);
      System.out.println("Day with maximum hours worked by all employees: Day " + (dayWithMaxHours + 1));
  }

  public static int findLongestWorkingEmployee(int[][] hours, int day1, int day2) {
      int maxHours = 0;
      int employeeIndex = -1;

      for (int i = 0; i < hours.length; i++) {
          int totalHours = hours[i][day1] + hours[i][day2];
          if (totalHours > maxHours) {
              maxHours = totalHours;
              employeeIndex = i;
          }
      }

      return employeeIndex;
  }

  public static int findDayWithMaxHours(int[][] hours) {
      int maxHours = 0;
      int dayIndex = -1;

      for (int j = 0; j < hours[0].length; j++) {
          int dayTotal = 0;
          for (int i = 0; i < hours.length; i++) {
              dayTotal += hours[i][j];
          }
          if (dayTotal > maxHours) {
              maxHours = dayTotal;
              dayIndex = j;
          }
      }

      return dayIndex;
  }
}

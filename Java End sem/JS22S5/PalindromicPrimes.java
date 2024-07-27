package JS22S5;
import java.util.*;
public class PalindromicPrimes {

  public static void main(String[] args) {
      int count = 0;
      int number = 2;

      while (count < 20) {
          if (isPrime(number) && isPalindrome(number)) {
              System.out.println(number);
              count++;
          }
          number++;
      }
  }

  // Method to check if a number is prime
  public static boolean isPrime(int num) {
      if (num <= 1) {
          return false;
      }
      for (int i = 2; i <= Math.sqrt(num); i++) {
          if (num % i == 0) {
              return false;
          }
      }
      return true;
  }

  // Method to check if a number is a palindrome
  public static boolean isPalindrome(int num) {
      String str = Integer.toString(num);
      int len = str.length();
      for (int i = 0; i < len / 2; i++) {
          if (str.charAt(i) != str.charAt(len - i - 1)) {
              return false;
          }
      }
      return true;
  }
}

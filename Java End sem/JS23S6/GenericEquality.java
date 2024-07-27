package JS23S6;

public class GenericEquality {
  // Generic method to compare two arguments
  public static <T> boolean isEqualTo(T arg1, T arg2) {
      if (arg1 == null) {
          return arg2 == null;
      }
      return arg1.equals(arg2);
  }

  public static void main(String[] args) {
      // Test with Integer
      Integer int1 = 10;
      Integer int2 = 10;
      Integer int3 = 20;
      
      System.out.println("Integer comparison (10, 10): " + isEqualTo(int1, int2)); // true
      System.out.println("Integer comparison (10, 20): " + isEqualTo(int1, int3)); // false

      // Test with String
      String str1 = "hello";
      String str2 = "hello";
      String str3 = "world";

      System.out.println("String comparison (hello, hello): " + isEqualTo(str1, str2)); // true
      System.out.println("String comparison (hello, world): " + isEqualTo(str1, str3)); // false

      // Test with Double
      Double dbl1 = 5.5;
      Double dbl2 = 5.5;
      Double dbl3 = 6.5;

      System.out.println("Double comparison (5.5, 5.5): " + isEqualTo(dbl1, dbl2)); // true
      System.out.println("Double comparison (5.5, 6.5): " + isEqualTo(dbl1, dbl3)); // false

      // Test with Object
      Object obj1 = new Object();
      Object obj2 = obj1;
      Object obj3 = new Object();

      System.out.println("Object comparison (same object): " + isEqualTo(obj1, obj2)); // true
      System.out.println("Object comparison (different objects): " + isEqualTo(obj1, obj3)); // false
  }
}

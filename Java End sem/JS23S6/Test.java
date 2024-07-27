package JS23S6;

public class Test {
  public static void main(String[] args) {
      Thread thread1 = new Thread(new MyCurrentDate());
      Thread thread2 = new Thread(new MyCurrentDate());
      Thread thread3 = new Thread(new MyCurrentDate());

      thread1.start();
      thread2.start();
      thread3.start();
  }
}


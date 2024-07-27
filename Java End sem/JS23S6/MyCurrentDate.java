package JS23S6;
import java.util.Date;

public class MyCurrentDate implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread ID: " + Thread.currentThread().getId() +
                    " | Current Date: " + new Date());
            try {
                Thread.sleep(100); // Sleep for 100 milliseconds
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

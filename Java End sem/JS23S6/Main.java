package JS23S6;
class DisplayMessage extends Thread {
    private String message;
    private int count;

    public DisplayMessage(String message, int count) {
        this.message = message;
        this.count = count;
    }

    public void run() {
        try {
            for (int i = 0; i < count; i++) {
                System.out.println(message);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String message = "Welcome to Java";
        int repeatCount = 3;

        DisplayMessage thread1 = new DisplayMessage(message, repeatCount);
        DisplayMessage thread2 = new DisplayMessage(message, repeatCount);

        thread1.start();
        thread2.start();
    }
}

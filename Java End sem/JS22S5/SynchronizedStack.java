package JS22S5;

import java.util.ArrayList;

public class SynchronizedStack<T> {
    private ArrayList<T> stack;

    public SynchronizedStack() {
        this.stack = new ArrayList<>();
    }

    public synchronized void push(T element) {
        stack.add(element);
    }

    public synchronized T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    public synchronized boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedStack<Integer> stack = new SynchronizedStack<>();

        Runnable pushTask = () -> {
            for (int i = 0; i < 5; i++) {
                stack.push(i);
                System.out.println("Pushed: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable popTask = () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Popped: " + stack.pop());
            }
        };

    
        Thread pushThread1 = new Thread(pushTask);
        Thread pushThread2 = new Thread(pushTask);
        Thread popThread1 = new Thread(popTask);     
        Thread popThread2 = new Thread(popTask);

        pushThread1.start();
        pushThread1.join();
        pushThread2.start();
        pushThread2.join();
        popThread1.start();
        popThread1.join();
        popThread2.start();
        popThread2.join();
    }
}

package JS22S6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

interface Even {
    void EvenNumberGeneration(int limit); // Method to generate even numbers up to 'limit'
}

interface Odd {
    void OddNumberGeneration(int limit); // Method to generate odd numbers up to 'limit'
}

class NumberGenerator implements Even, Odd {
    private int evenLimit;
    private int oddLimit;
    private ArrayList<Integer> numbers;

    public NumberGenerator(int evenLimit, int oddLimit) {
        this.evenLimit = evenLimit;
        this.oddLimit = oddLimit;
        this.numbers = new ArrayList<>();
    }

    @Override
    public void EvenNumberGeneration(int limit) {
        for (int i = 0; i <= limit; i += 2) {
            numbers.add(i);
        }
    }

    @Override
    public void OddNumberGeneration(int limit) {
        for (int i = 1; i <= limit; i += 2) {
            numbers.add(i);
        }
    }

    public void generateAndSortNumbers() {
        EvenNumberGeneration(evenLimit);
        OddNumberGeneration(oddLimit);

        // Sorting the combined list of even and odd numbers using a custom comparator
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return Integer.compare(num1, num2); // For ascending order
            }
        });
    }

    public void displayNumbers() {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator(10, 15);
        generator.generateAndSortNumbers();
        generator.displayNumbers();
    }
}

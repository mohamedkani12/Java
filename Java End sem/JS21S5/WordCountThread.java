import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountThread extends Thread {
    private final String filename;

    public WordCountThread(String filename) {
        this.filename = filename;
    }

    @Override
    public void run() {
        int wordCount = countWords(filename);
        System.out.println(filename + " : " + wordCount);
    }

    private int countWords(String filename) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.trim().split("\\s+");
                count += words.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java WordCountThread <file1> [<file2> ...]");
            return;
        }

        for (String filename : args) {
            WordCountThread thread = new WordCountThread(filename);
            thread.start();
        }
    }
}


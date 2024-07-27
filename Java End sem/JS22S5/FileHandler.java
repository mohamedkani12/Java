package JS22S5;
import java.io.*;
import java.util.ArrayList;

public class FileHandler {
    private static final String FILE_NAME = "phonebook_data.txt";

    public static void write(ArrayList<Phonebook> phonebooks) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            outputStream.writeObject(phonebooks);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static ArrayList<Phonebook> read() {
        ArrayList<Phonebook> phonebooks = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
          phonebooks =(ArrayList<Phonebook>) inputStream.readObject();
            System.out.println("Data read from file successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
        return phonebooks;
    }
}

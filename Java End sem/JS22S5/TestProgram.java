package JS22S5;
import java.util.ArrayList;

public class TestProgram {
    public static void main(String[] args) {
        // Create some Phonebook objects
        ArrayList<Phonebook> phonebooks = new ArrayList<>();
        phonebooks.add(new Phonebook("John Doe", "Friends", 0, 123456789));
        phonebooks.add(new Phonebook("Alice Smith", "Relatives", 1, 987654321));
        phonebooks.add(new Phonebook("Bob Johnson", "Business", 0, 456789123));
        phonebooks.add(new Phonebook("Emily Brown", "Friends", 2, 789456123));

        // Write Phonebook objects to file
        FileHandler.write(phonebooks);

        // Read Phonebook objects from file
        ArrayList<Phonebook> readPhonebooks = FileHandler.read();

        // Print Phonebook objects with primary contact 0
        System.out.println("Phonebook entries with primary contact 0:");
        for (Phonebook entry : readPhonebooks) {
            if (entry.getPrimaryContact() == 0) {
                entry.display();
                System.out.println();
            }
            
        }
    }
}

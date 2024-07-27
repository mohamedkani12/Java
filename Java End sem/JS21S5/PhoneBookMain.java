import java.util.ArrayList;

public class PhoneBookMain {
    public static void main(String[] args) {
        ArrayList<PhoneBook> phoneBookList = new ArrayList<>();

        // Create at least five PhoneBook objects
        PhoneBook entry1 = new PhoneBook("John Doe", 1234567890);
        PhoneBook entry2 = new PhoneBook("Jane Doe", 987654321);
        PhoneBook entry3 = new PhoneBook("John Smith", 555555555);
        PhoneBook entry4 = new PhoneBook("Alice Johnson", 888888888);
        PhoneBook entry5 = new PhoneBook("John Doe", 999999999); // Duplicate name

        // Add entries to the ArrayList
        phoneBookList.add(entry1);
        phoneBookList.add(entry2);
        phoneBookList.add(entry3);
        phoneBookList.add(entry4);
        phoneBookList.add(entry5);

        // Remove duplicates based on name
        removeDuplicateNames(phoneBookList);

        // Display PhoneBook objects
        System.out.println("Unique PhoneBook Entries:");
        for (PhoneBook entry : phoneBookList) {
            System.out.println(entry);
        }
    }

    public static void removeDuplicateNames(ArrayList<PhoneBook> phoneBookList) {
        ArrayList<String> namesList = new ArrayList<>();
        ArrayList<PhoneBook> uniqueList = new ArrayList<>();

        for (PhoneBook entry : phoneBookList) {
            if (!namesList.contains(entry.getName())) {
                namesList.add(entry.getName());
                uniqueList.add(entry);
            }
        }

        phoneBookList.clear();
        phoneBookList.addAll(uniqueList);
    }
}


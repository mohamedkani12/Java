package JS22S5;

import java.io.Serializable;

class Phonebook implements Serializable{
  private String name;
  private String category;
  private int primaryContact;
  private int secondaryContact;

  // Constructor with arguments
  public Phonebook(String name, String category, int primaryContact, int secondaryContact) {
      this.name = name;
      this.category = category;
      this.primaryContact = primaryContact;
      this.secondaryContact = secondaryContact;
  }
  public String getName() {
    return name;
}

public String getCategory() {
    return category;
}

public int getPrimaryContact() {
    return primaryContact;
}

public int getSecondaryContact() {
    return secondaryContact;
}
  // Method to display contact details
  public void display() {
      System.out.println("Name: " + name);
      System.out.println("Category: " + category);
      System.out.println("Primary Contact: " + primaryContact);
      System.out.println("Secondary Contact: " + secondaryContact);
  }

  // Method to search for a name in an array of Phonebook objects
  public static boolean search(Phonebook[] phonebookArray, String name) {
      for (Phonebook contact : phonebookArray) {
          if (contact.name.equalsIgnoreCase(name)) {
              return true;
          }
      }
      return false;
  }

  // Method to find the total number of relatives in an array of Phonebook objects
  public static int find(Phonebook[] phonebookArray) {
      int count = 0;
      for (Phonebook contact : phonebookArray) {
          if (contact.category.equalsIgnoreCase("relatives")) {
              count++;
          }
      }
      return count;
  }

  // Main method to test the Phonebook class
  public static void main(String[] args) {
      // Create an array of Phonebook objects
      Phonebook[] contacts = {
          new Phonebook("Alice", "friends", 1234567890, 1876543210),
          new Phonebook("Bob", "relatives", 1345678901, 1765432109),
          new Phonebook("Charlie", "business", 1456789012, 1654321098),
          new Phonebook("David", "relatives", 1567890123, 1543210987),
          new Phonebook("Eve", "friends", 1678901234, 1432109876)
      };

      // Display all contacts
      for (Phonebook contact : contacts) {
          contact.display();
          System.out.println();
      }

      // Search for a name
      String searchName = "Bob";
      boolean isFound = Phonebook.search(contacts, searchName);
      System.out.println("Is " + searchName + " found? " + isFound);

      // Find the total number of relatives
      int totalRelatives = Phonebook.find(contacts);
      System.out.println("Total number of relatives: " + totalRelatives);
  }
}


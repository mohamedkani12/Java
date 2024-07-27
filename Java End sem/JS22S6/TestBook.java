package JS22S6;
public class TestBook {
  public static void main(String[] args) {
      try {
          HardCopy hardCopy1 = new HardCopy(1, "Hard Copy Book 1", "Author A", "Publisher X", 29.99, 100, 200, 50);
          SoftCopy softCopy1 = new SoftCopy(2, "Soft Copy Book 1", "Author B", "Publisher Y", 19.99, 80, 120, 30);

          System.out.println("Initial Details:");
          System.out.println("Hard Copy - Book Number: " + hardCopy1.getBookNumber() + ", Title: " + hardCopy1.getTitle() + ", Author: " + hardCopy1.getAuthor() + ", Publisher: " + hardCopy1.getPublisher() + ", Price: " + hardCopy1.getPrice() + ", Number of Books Sold: " + hardCopy1.getNumberOfBooksSold() + ", Number of Pages: " + hardCopy1.getNumberOfPages() + ", Number of Copies Sold: " + hardCopy1.getNumberOfCopiesSold());
          System.out.println("Soft Copy - Book Number: " + softCopy1.getBookNumber() + ", Title: " + softCopy1.getTitle() + ", Author: " + softCopy1.getAuthor() + ", Publisher: " + softCopy1.getPublisher() + ", Price: " + softCopy1.getPrice() + ", Number of Books Sold: " + softCopy1.getNumberOfBooksSold() + ", Playing Time: " + softCopy1.getPlayingTime() + ", Number of CDs Sold: " + softCopy1.getNumberOfCDsSold());

          // Selling books and updating counts
          hardCopy1.sellCopies(20);
          softCopy1.sellCDs(10);

          System.out.println("\nUpdated Details:");
          System.out.println("Hard Copy - Book Number: " + hardCopy1.getBookNumber() + ", Title: " + hardCopy1.getTitle() + ", Author: " + hardCopy1.getAuthor() + ", Publisher: " + hardCopy1.getPublisher() + ", Price: " + hardCopy1.getPrice() + ", Number of Books Sold: " + hardCopy1.getNumberOfBooksSold() + ", Number of Pages: " + hardCopy1.getNumberOfPages() + ", Number of Copies Sold: " + hardCopy1.getNumberOfCopiesSold());
          System.out.println("Soft Copy - Book Number: " + softCopy1.getBookNumber() + ", Title: " + softCopy1.getTitle() + ", Author: " + softCopy1.getAuthor() + ", Publisher: " + softCopy1.getPublisher() + ", Price: " + softCopy1.getPrice() + ", Number of Books Sold: " + softCopy1.getNumberOfBooksSold() + ", Playing Time: " + softCopy1.getPlayingTime() + ", Number of CDs Sold: " + softCopy1.getNumberOfCDsSold());

          // Attempt to sell a negative number of books (should raise an exception)
        
              hardCopy1.sellCopies(-5);
         

      } catch (NegativeBooksSoldException e) {
          System.err.println("Exception: " + e.getMessage());
      }
  }
}

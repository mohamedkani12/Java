package JS22S6;
public class Book {
  private int bookNumber;
  private String title;
  private String author;
  private String publisher;
  private double price;
  protected int numberOfBooksSold; // Use protected so derived classes can access it

  public Book(int bookNumber, String title, String author, String publisher, double price, int numberOfBooksSold) throws NegativeBooksSoldException {
      if (numberOfBooksSold < 0) {
          throw new NegativeBooksSoldException("Number of books sold cannot be negative");
      }
      this.bookNumber = bookNumber;
      this.title = title;
      this.author = author;
      this.publisher = publisher;
      this.price = price;
      this.numberOfBooksSold = numberOfBooksSold;
  }

  public int getBookNumber() {
      return bookNumber;
  }

  public String getTitle() {
      return title;
  }

  public String getAuthor() {
      return author;
  }

  public String getPublisher() {
      return publisher;
  }

  public double getPrice() {
      return price;
  }

  public int getNumberOfBooksSold() {
      return numberOfBooksSold;
  }

  public void setNumberOfBooksSold(int numberOfBooksSold) throws NegativeBooksSoldException {
      if (numberOfBooksSold < 0) {
          throw new NegativeBooksSoldException("Number of books sold cannot be negative");
      }
      this.numberOfBooksSold = numberOfBooksSold;
  }

  public void sellBooks(int number) throws NegativeBooksSoldException {
      if (number < 0) {
          throw new NegativeBooksSoldException("Cannot sell a negative number of books");
      }
      this.numberOfBooksSold += number;
  }
}


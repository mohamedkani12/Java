package JS22S6;
public class HardCopy extends Book {
  private int numberOfPages;
  private int numberOfCopiesSold;

  public HardCopy(int bookNumber, String title, String author, String publisher, double price, int numberOfBooksSold, int numberOfPages, int numberOfCopiesSold) throws NegativeBooksSoldException {
      super(bookNumber, title, author, publisher, price, numberOfBooksSold);
      if (numberOfCopiesSold < 0) {
          throw new NegativeBooksSoldException("Number of copies sold cannot be negative");
      }
      this.numberOfPages = numberOfPages;
      this.numberOfCopiesSold = numberOfCopiesSold;
  }

  public int getNumberOfPages() {
      return numberOfPages;
  }

  public int getNumberOfCopiesSold() {
      return numberOfCopiesSold;
  }

  public void sellCopies(int number) throws NegativeBooksSoldException {
      if (number < 0) {
          throw new NegativeBooksSoldException("Cannot sell a negative number of copies");
      }
      this.numberOfCopiesSold += number;
      this.sellBooks(number); // Update the total number of books sold
  }
}


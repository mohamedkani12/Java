package JS22S6;
public class SoftCopy extends Book {
  private int playingTime;
  private int numberOfCDsSold;

  public SoftCopy(int bookNumber, String title, String author, String publisher, double price, int numberOfBooksSold, int playingTime, int numberOfCDsSold) throws NegativeBooksSoldException {
      super(bookNumber, title, author, publisher, price, numberOfBooksSold);
      if (numberOfCDsSold < 0) {
          throw new NegativeBooksSoldException("Number of CDs sold cannot be negative");
      }
      this.playingTime = playingTime;
      this.numberOfCDsSold = numberOfCDsSold;
  }

  public int getPlayingTime() {
      return playingTime;
  }

  public int getNumberOfCDsSold() {
      return numberOfCDsSold;
  }

  public void sellCDs(int number) throws NegativeBooksSoldException {
      if (number < 0) {
          throw new NegativeBooksSoldException("Cannot sell a negative number of CDs");
      }
      this.numberOfCDsSold += number;
      this.sellBooks(number); // Update the total number of books sold
  }
}

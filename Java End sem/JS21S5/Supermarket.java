public class Supermarket {
  public static void main(String[] args) {
      // Writing SupermarketItem objects to file
      FileHandler.writeObject(new SupermarketItem("Apples", 5, 1.99));
      FileHandler.writeObject(new SupermarketItem("Bananas", 15, 2.49));
      FileHandler.writeObject(new SupermarketItem("Oranges", 8, 1.79));
      FileHandler.writeObject(new SupermarketItem("Grapes", 20, 3.99));

      // Reading objects from file and printing those with stock less than 10
      FileHandler.readObjectsAndPrint();
  }
}

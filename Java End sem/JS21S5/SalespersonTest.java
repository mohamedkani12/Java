public class SalespersonTest {
  public static void main(String[] args) {
      // Create an object of Salesperson
      Salesperson sp = new Salesperson(30, "John Doe", 50000.00);

      // Test addSale method
      sp.addSale(300);
      sp.addSale(150);
      sp.addSale(500);
      sp.addSale(250);
      sp.addSale(400);
      sp.addSale(100);
      sp.addSale(200);
      sp.addSale(350);
      sp.addSale(600);
      sp.addSale(700); // This makes it 10 sales

      // Test getSales method
      System.out.println("Total Sales Made: " + sp.getSales());

      // Display details of the Salesperson
      sp.display();

      // Adding more sales to test bonus ranges
      for (int i = 0; i < 35; i++) {
          sp.addSale(100); // Adding 35 more sales to make total 45 sales
      }

      // Display updated details with bonus
      sp.display();
  }
}

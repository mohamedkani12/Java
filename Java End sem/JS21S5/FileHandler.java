import java.io.*;

public class FileHandler {
    private static final String FILENAME = "input.txt";

    public static void writeObject(SupermarketItem item) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(FILENAME, true))) {
            outputStream.writeObject(item);
            System.out.println("Object written to file: " + item);
        } catch (IOException e) {
            System.out.println("Error writing object to file: " + e.getMessage());
        }
    }

    public static void readObjectsAndPrint() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(FILENAME))) {
            while (true) {
                SupermarketItem item = (SupermarketItem) inputStream.readObject();
                if (item.getStock() < 10) {
                    System.out.println("SupermarketItem with stock less than 10: " + item);
                }
            }
         } //catch (EOFException e) {
        //     // End of file reached
        // } catch (IOException | ClassNotFoundException e) {
        //     System.out.println("Error reading objects from file: " + e.getMessage());
        // }
        catch (Exception e){
          System.out.println("Program End");
        }
    }
}

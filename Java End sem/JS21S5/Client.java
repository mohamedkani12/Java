import java.io.*;
import java.net.*;
import java.util.*;
public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             DataInputStream inputStream = new DataInputStream(socket.getInputStream());
             DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Scanner in = new Scanner(System.in);
            // Get amount and years from user
            System.out.print("Enter amount: ");
            // double amount = Double.parseDouble(reader.readLine());
            double amount = in.nextDouble();
            System.out.print("Enter years: ");
            // int years = Integer.parseInt(reader.readLine());
            int years = in.nextInt();

            // Send data to server
            outputStream.writeDouble(amount);
            outputStream.writeInt(years);

            // Receive result from server
            double interest = inputStream.readDouble();
            System.out.println("Interest after " + years + " years at 5% rate: $" + interest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


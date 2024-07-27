import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server started. Waiting for client connection...");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected.");

                DataInputStream inputStream = new DataInputStream(socket.getInputStream());
                DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

                // Read amount and years from client
                double amount = inputStream.readDouble();
                int years = inputStream.readInt();

                // Calculate interest
                double interest = calculateInterest(amount, years);

                // Send result to client
                outputStream.writeDouble(interest);

                // Close resources
                socket.close();
                inputStream.close();
                outputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double calculateInterest(double amount, int years) {
        // Assuming fixed interest rate of 5%
        double rate = 0.05;
        return amount * rate * years;
    }
}

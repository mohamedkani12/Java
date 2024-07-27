package JS22S6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class VotingEligibilityServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000); // Server socket listening on port 5000
            System.out.println("Server started. Waiting for client...");

            Socket socket = serverSocket.accept(); // Accept client connection
            System.out.println("Client connected.");

            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            int age = inputStream.readInt(); // Read age sent by client
            System.out.println("Received age from client: " + age);

            String response = (age >= 18) ? "You are eligible to vote." : "You are not eligible to vote.";
            outputStream.writeUTF(response); // Send eligibility response back to client

            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

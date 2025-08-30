package BasicServer;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Create a server socket on port 5000
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");

            // Wait for client to connect
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            // Setup input and output streams
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Read message from client
            String message = input.readLine();
            System.out.println("Client says: " + message);

            // Send response to client
            output.println("Hello Client, I received your message!");

            // Close resources
            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

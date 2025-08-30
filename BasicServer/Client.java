package BasicServer;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Connect to the server (localhost means same machine, port 5000)
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to server!");

            // Setup input and output streams
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Send message to server
            output.println("Hello Server, this is Client!");

            // Read server’s response
            String response = input.readLine();
            System.out.println("Server says: " + response);

            // Close resources
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static final int PORT = 5000;
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(PORT);
        System.out.println("El servidor se esta ejecutando en el puerto " + PORT);

        Socket client1 = server.accept();
        System.out.println("El cliente 1 se conecto");

        Socket client2 = server.accept();
        System.out.println("El cliente 2 se conecto");

        BufferedReader br1 = new BufferedReader(
            new InputStreamReader(client1.getInputStream()));

        BufferedReader br2 = new BufferedReader(
            new InputStreamReader(client2.getInputStream()));

        PrintWriter out1 = new PrintWriter(client1.getOutputStream(), true);
        PrintWriter out2 = new PrintWriter(client2.getOutputStream(), true);

        ChatServerThread t1 = new ChatServerThread(br1, out2);
        ChatServerThread t2 = new ChatServerThread(br2, out1);
        t1.start();
        t2.start();
    }
}
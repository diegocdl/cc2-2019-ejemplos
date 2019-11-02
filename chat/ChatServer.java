import java.io.BufferedReader;
import java.io.DataOutputStream;
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

        DataOutputStream out1 = new DataOutputStream(client1.getOutputStream());
        DataOutputStream out2 = new DataOutputStream(client2.getOutputStream());

        ChatServerThread t1 = new ChatServerThread(br1, out2);
        ChatServerThread t2 = new ChatServerThread(br2, out1);
        t1.start();
        t2.start();
    }
}
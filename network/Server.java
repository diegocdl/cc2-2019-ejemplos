import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    static int port = 5000;
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(port);
            System.out.println("Server corriendo en el puerto " + port + ", esperando conexion...");
            Socket socketClient = server.accept();
            System.out.println("Cliente conectado");
            
            InputStreamReader isr = new InputStreamReader(socketClient.getInputStream());
            BufferedReader in = new BufferedReader(isr);
    
            DataOutputStream out = new DataOutputStream(socketClient.getOutputStream());
    
            out.writeUTF("Bienvenido al servidor de cc2 :)\n");
            System.out.println("Cliente: " + in.readLine());

            in.close();
            out.close();
            socketClient.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
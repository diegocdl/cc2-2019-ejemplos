import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socketServer = new Socket("localhost", Server.port);
            InputStreamReader isr = new InputStreamReader(socketServer.getInputStream());
            BufferedReader in = new BufferedReader(isr);

            DataOutputStream out = new DataOutputStream(socketServer.getOutputStream());

            System.out.println("Servidor: " + in.readLine());
            out.writeUTF("Gracias, por aceptar mi solicitud Sr. Servidor\n");

            in.close();
            out.close();
            socketServer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
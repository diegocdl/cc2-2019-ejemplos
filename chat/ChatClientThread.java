import java.io.BufferedReader;
import java.io.DataOutput;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JTextArea;

public class ChatClientThread extends Thread {
    protected Socket socket;
    protected BufferedReader bufferedReader;
    protected PrintWriter dataOut;
    protected JTextArea msgs;

    public ChatClientThread(Socket s, JTextArea msgs) throws Exception {
        socket = s;
        bufferedReader = new BufferedReader(new InputStreamReader(s.getInputStream()));
        dataOut = new PrintWriter(s.getOutputStream(), true);
        this.msgs = msgs;
    }

    public void send(String txt) throws IOException {
        System.out.println("Enviando: " + txt);
        dataOut.println(txt);
    }

    public void run() {
        String txt = "";
        try {
            while(true) {
                txt = bufferedReader.readLine();
                // si se recibe null terminar ciclo
                if(txt == null || txt.equals("null")) {
                    break;
                }
                System.out.println("Recibido: " + txt);

                // agregar al textArea 
                msgs.append("Amigo: " + txt + "\n");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
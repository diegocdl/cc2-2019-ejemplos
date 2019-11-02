import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.*;
import java.net.Socket;

public class ChatClientWindow implements ActionListener {
    public static final String IP = "localhost";
    public static final int PORT = 5000;

    protected JButton sendBtn;
    protected JTextField input;
    protected JTextArea msgs;
    protected Socket socket;
    protected ChatClientThread chatClientThread;

    public ChatClientWindow() {
        loadGUIComponents();
        connect2Server();
    }

    public void loadGUIComponents() {
        JFrame ventana = new JFrame();

        input = new JTextField();
        input.setBounds(10, 450, 390, 20);
        ventana.add(input);
        
        sendBtn = new JButton("enviar");
        sendBtn.setBounds(410, 450, 80, 20);
        sendBtn.addActionListener(this);
        ventana.add(sendBtn);

        msgs = new JTextArea();
        msgs.setBounds(10, 10, 480, 430);
        ventana.add(msgs);

        ventana.setSize(500, 500);
        ventana.setLayout(null);
        ventana.setVisible(true);
    }

    public void connect2Server() {
        try {
            // establecer conexion con server
            // y iniciar thread que escuchara al server.
            socket = new Socket(IP, PORT);
            chatClientThread = new ChatClientThread(socket, msgs);
            chatClientThread.start();
        } catch(Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void actionPerformed(ActionEvent e) {
        System.out.print("Enviando mensaje... ");
        try {
            // enviar el mensaje al server
            chatClientThread.send(input.getText());
            System.out.println("Mensaje enviado!");

            // Agregar el mensaje al textArea
            msgs.append("User: " + input.getText() + "\n");

            // Limpiar el contenido del textField para siguiente mensaje
            input.setText("");
        } catch (Exception ex) {
            System.out.println("ERROR enviando el mensaje");
            ex.printStackTrace();
            System.exit(1);
        }
    }
    public static void main(String[] args) {
        ChatClientWindow v = new ChatClientWindow();
    }
}
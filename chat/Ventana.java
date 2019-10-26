import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.*;

public class Ventana implements ActionListener {

    public Ventana() {
        JFrame ventana = new JFrame();

        JTextField input = new JTextField();
        input.setBounds(10, 450, 390, 20);
        ventana.add(input);
        
        JButton sendBtn = new JButton("enviar");
        sendBtn.setBounds(410, 450, 80, 20);
        sendBtn.addActionListener(this);
        ventana.add(sendBtn);

        JTextArea msgs = new JTextArea();
        msgs.setBounds(10, 10, 480, 430);
        ventana.add(msgs);

        ventana.setSize(500, 500);
        ventana.setLayout(null);
        ventana.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Se hizo click en enviar");
    }
    public static void main(String[] args) {
        Ventana v = new Ventana();
    }
}
import javax.swing.*;
import java.awt.event.*;

public class HelloWorld implements ActionListener {
    public HelloWorld() {
        JFrame window = new JFrame();

        JLabel label = new JLabel("Hola Mundo");
        label.setBounds(50, 50, 400, 30);
        window.add(label);

        JButton button = new JButton("click me!");
        button.setBounds(100, 80, 300, 30);
        button.addActionListener(this);
        window.add(button);


        window.setSize(500, 200);
        window.setLayout(null);
        window.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Click en boton");
    }

    public static void main(String[] args) {
        HelloWorld h = new HelloWorld();
    }
}
import java.awt.*;
import java.util.*;

import javax.swing.JFrame;
public class DibujoTest {
    public static void main(String[] args) throws Exception {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Ellipse(100, 100, 100, 50));
        shapes.add(new Circle(400, 400, 100));
        shapes.add(new Rectangle(400, 400, 50, 100));
        shapes.add(new Square(400, 400, 200));
        shapes.add(new Triangle(600, 600, 100, 150));
        Dibujo canvas = new Dibujo(shapes);
        show(canvas);
    }

    public static void show(Dibujo d) {
        JFrame frame = new JFrame("My Drawing");
        d.setSize(800, 800);
        frame.add(d);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }    
}
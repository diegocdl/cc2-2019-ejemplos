import java.awt.*;
import java.util.*;

public class Dibujo extends Canvas {
    public static final int GRID_SIZE = 50;
    ArrayList<Shape> shapes;

    public Dibujo(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public void paint(Graphics g) {
        drawGrid(g);
        for(Shape s : shapes) {
            s.draw(g);
        }
    }

    public void drawGrid(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.LIGHT_GRAY);
        for(int i = 0; i < getWidth(); i += GRID_SIZE) {
            g.drawLine(i, 0, i, getHeight());
        }

        for(int i = 0; i < getHeight(); i += GRID_SIZE) {
            g.drawLine(0, i, getWidth(), i);
        }
        g.setColor(c);
    }
}
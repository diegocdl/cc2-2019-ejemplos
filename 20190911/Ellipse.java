import java.awt.Graphics;

public class Ellipse extends Shape {
    protected int width;
    protected int height;

    public Ellipse(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        int x = center.getX() - width/2;
        int y = center.getY() - height/2;
        g.drawOval(x, y, width, height);
    }
}
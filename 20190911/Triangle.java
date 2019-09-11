import java.awt.Graphics;

public class Triangle extends Shape {
    protected int base;
    protected int height;

    public Triangle(int x, int y, int b, int h) {
        super(x, y);
        this.base = b;
        this.height = h;
    }

    public void draw(Graphics g) {
        int p1x = center.getX() - base/2;
        int p1y = center.getY() - height/2;
        int p2x = center.getX() - base/2;
        int p2y = center.getY() + height/2;
        int p3x = center.getX() + base/2;
        int p3y = center.getY() + height/2;
        int[] x = {p1x, p2x, p3x};
        int[] y = {p1y, p2y, p3y};
        g.drawPolygon(x, y, 3);
    }
}
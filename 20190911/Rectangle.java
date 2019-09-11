import java.awt.Graphics;

public class Rectangle extends Shape {
    protected int base;
    protected int altura;
    
    public Rectangle(int x, int y, int base, int altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void draw(Graphics g) {
       int x = center.getX() - base/2;
       int y = center.getY() - altura/2;
       g.drawRect(x, y, base, altura); 
    }
}
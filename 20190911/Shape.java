import java.awt.Graphics;

public abstract class Shape {
    protected Point center;

    public Shape(int x, int y) {
		this.center = new Point(x, y);
    }
    
	public Point center() {
		return this.center;
    }
    
	// public abstract double area();
    // public abstract double perimeter();
    
    public abstract void draw(Graphics g);

}
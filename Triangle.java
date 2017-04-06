import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;


public class Triangle {
	
	////////////////////////////////////////////////
	// FIELDS
	////////////////////////////////////////////////
	private int x;
	private int y;
	private int size;
	private Color fillColor;
	
	////////////////////////////////////////////////
	// CONSTRUCTOR
	////////////////////////////////////////////////
	public Triangle()
	{
		x = 0;
		y = 0;
		size = 150;
		fillColor = Color.gray;
	}	
	
	////////////////////////////////////////////////
	// METHODS
	////////////////////////////////////////////////
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Color getFillColor() {
		return fillColor;
	}

	public void setFillColor(Color color) {
		this.fillColor = color;
	}
	
	public void paintComponent(Graphics g) {
		Color tc = g.getColor();
		
		g.setColor(fillColor);
		
		int[] xp = new int[]{
				x - size / 2,
				x,
				x + size / 2 };
		int[] yp = new int[]{
				y + size / 2,
				y - size / 2,
				y + size / 2 };
		g.fillPolygon(xp, yp, 3);
		
		g.setColor(tc);
	}

}

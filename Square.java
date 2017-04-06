

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class Square {
	
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
	public Square()
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
		g.fillRect(x, y, size, size);
		
		g.setColor(tc);
	}

/**
* Create the applet.
*/
public void testApplet() {

initGUI();
}

private void initGUI() {
getContentPane().add(getScrollPane_1(), BorderLayout.CENTER);
}

private JScrollPane getScrollPane_1() {
if (scrollPane == null) {
scrollPane = new JScrollPane();
scrollPane.setViewportView(getPanel_2());
}
return scrollPane;
}

private SizeableJPanel getPanel_2() {
if (panel == null) {
panel = new SizeableJPanel();
panel.setLayout(null);
panel.add(getBtnNewButton());
panel.add(getBtnNewButton_1());
panel.add(getPanel_1());
}
return panel;
}

private JButton getBtnNewButton() {
if (btnNewButton == null) {
btnNewButton = new JButton("New button");
btnNewButton.setBounds(51, 56, 107, 25);
}
return btnNewButton;
}

private JButton getBtnNewButton_1() {
if (btnNewButton_1 == null) {
btnNewButton_1 = new JButton("New button");
btnNewButton_1.setBounds(306, 314, 107, 25);
}
return btnNewButton_1;
}

private JPanel getPanel_1() {
if (panel_1 == null) {
panel_1 = new JPanel();
panel_1.setBounds(10, 400, 550, 900);
panel_1.setLayout(null);
panel_1.add(getButton_1());
}
return panel_1;
}

private JButton getButton_1() {
if (btnNewButton_2 == null) {
btnNewButton_2 = new JButton("New button");
btnNewButton_2.setBounds(180, 800, 107, 25);
}
return btnNewButton_2;
}
}
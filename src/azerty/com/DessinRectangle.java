package azerty.com;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

public class DessinRectangle extends DessinForme {
	
	public DessinRectangle(Color couleur, Point pos, Dimension dim) {
		super(couleur, pos, dim);
		
	}

	public void draw(Graphics g) {
		Color c = g.getColor();
		g.setColor(couleur);
		g.fillRect(rectangle1.x,rectangle1.y,rectangle1.height,rectangle1.width);
		g.setColor(c);
	}

}

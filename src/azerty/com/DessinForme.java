package azerty.com;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public abstract class DessinForme implements Draw {
	
	protected Rectangle rectangle1;
	protected Color couleur;

	public DessinForme(Color couleur, Point pos, Dimension dim){
		this.couleur=couleur;
		this.rectangle1 = new Rectangle(pos,dim);
	}
	
	public abstract void draw(Graphics g) ;
	
	public Rectangle getRectangle(){
		return (Rectangle) rectangle1.clone();
	}
}

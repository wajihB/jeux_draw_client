package azerty.com;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

public class Main {

	public static void main(String[] args) {
		
		InterfaceDessin Test = new InterfaceDessin();
		Test.setBackground(Color.WHITE);
		Test.setPreferredSize(new Dimension(400,200));
		Dimension dim  =new Dimension(20,20);
		Draw rectangle1 = new DessinRectangle(Color.RED,new Point(10,10),dim);
		//Draw circle = new CircleDrawable(Color.RED,new Point(50,10),dim);
		Test.addDrawable(rectangle1);
	//	Test.addDrawable(circle);
		Gui.showOnFrame(Test,"essai");
	}

}

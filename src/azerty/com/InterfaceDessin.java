package azerty.com;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class InterfaceDessin extends JPanel {

private List drawables = new LinkedList();
	
	public void paint(Graphics g) {
		super.paint(g);
		for (Iterator iter = drawables.iterator(); iter.hasNext();) {
			Draw d = (Draw) iter.next();
			d.draw(g);	
		}
	}

	public void addDrawable(Draw d) {
		drawables.add(d);
		repaint();
	}

	public void removeDrawable(Draw d) {
		drawables.remove(d);
		repaint();
	}

	public void clear() {
		drawables.clear();
		repaint();
	}
		

}

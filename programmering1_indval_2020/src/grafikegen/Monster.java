package grafikegen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Monster extends JComponent {

	public Monster() {

		setPreferredSize(new Dimension(400, 400));

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(Color.GREEN);
		g.fillOval(100, 100, 100, 100);
		g.fillRect(100, 150, 100, 50);
		g.fillOval(100, 180, 40, 40);
		g.fillOval(130, 180, 40, 40);
		g.fillOval(160, 180, 40, 40);
		g.setColor(Color.BLACK);
		g.fillOval(120, 120, 10, 10);
		g.fillOval(160, 120, 10, 10);
	}

}

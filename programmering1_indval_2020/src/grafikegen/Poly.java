package grafikegen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Poly extends JComponent {


	int [] xPoints= {100,250,300};
	int [] yPoints= {100,200,300};

	public Poly() {

		setPreferredSize(new Dimension(500,500));

	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.setColor(new Color(200,200,200));
		g.fillPolygon(xPoints, yPoints, xPoints.length);
	}


	public static void main(String[] args) {


		JFrame frame= new JFrame();
	    frame.setVisible(true);
	    frame.setContentPane(new Poly() );
	    frame.pack();
	    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);



	}
}

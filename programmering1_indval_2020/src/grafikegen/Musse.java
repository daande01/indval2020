package grafikegen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Musse extends JComponent {

	public Musse() {
		this.setPreferredSize(new Dimension(400,400));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillOval(100, 100, 100, 100);
		g.fillOval(80, 90, 50,50);
		g.fillOval(170, 90, 50,50);
		g.setColor(Color.white);
		g.fillOval(115, 120, 40, 70);
		g.fillOval(145, 120, 40, 70);
		g.fillOval(120, 150, 60, 40);
		g.fillRect(200, 200, 40, 40);
	}

	public static void main(String[] args) {

		JFrame f= new JFrame();
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setContentPane(new Musse());
		f.setVisible(true);
		f.pack();
	}

}

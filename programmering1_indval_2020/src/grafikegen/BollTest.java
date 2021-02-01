package grafikegen;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class BollTest extends JComponent {

	private int x = 0;
	private int y = 0;

	public BollTest() {

		setPreferredSize(new Dimension(500, 500));

		Timer t = new Timer(40, e -> {

			update();

		});
		t.start();

	}

	public void update() {
		x = x + 2;
		y = y + 2;
		repaint();

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub

		super.paintComponent(g);
		g.fillOval(x, y, 50, 50);
	}

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setContentPane(new BollTest());
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.pack();

	}
}

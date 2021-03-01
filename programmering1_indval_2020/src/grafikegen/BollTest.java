package grafikegen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class BollTest extends JComponent implements KeyListener {

	private int x = 0;
	private int y = 10;
	private int xv = 2;
	private int yv = 3;
	private Color c;

	public BollTest(Color cc) {

		c = cc;
		addKeyListener(this);
		setPreferredSize(new Dimension(500, 500));

		Timer t = new Timer(40, e -> {

			update();



		});
		t.start();

	}

	public void update() {
		x = x + xv;
		y += yv;

		if (y >= (getSize().height - 50)) {

			yv = yv * -1;

		}
		if (x >= (getSize().width - 50)) {

			xv *= -1;

		}
		if (y <= 0) {

			yv *= -1;

		}
		if (x <= 0) {

			xv *= -1;

		}

		repaint();

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub

		super.paintComponent(g);
		g.setColor(c);
		g.fillOval(x, y, 50, 50);
	}

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());

		f.setContentPane(new BollTest(Color.pink));
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.pack();

	}

	@Override
	public void keyPressed(KeyEvent e) {



		 int tangent= e.getKeyCode();

		 if(tangent== KeyEvent.VK_UP) {


			 y=y-5;

		 }


	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}


	@Override
	public boolean isFocusTraversable() {
		// TODO Auto-generated method stub
		return true;
	}
}

package grafikegen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class BollTest extends JComponent {

	private int x = 0;
	private int y = 0;
	private int xv=2;
	private int yv=3;
	private Color c;


	public BollTest(Color cc ) {

		c=cc;

		setPreferredSize(new Dimension(500, 500));

		Timer t = new Timer(40, e -> {

			update();

			System.out.println(this.getSize().width);

		});
		t.start();

	}

	public void update() {
		x =x+xv;
		y +=yv;

		if(y>=(getSize().height-50)) {

			yv=yv*-1;

		}
		if(x>=(getSize().width-50)) {

			xv*=-1;

		}if(y<=0) {

			yv*=-1;

		}if(x<=0) {

			xv*=-1;

		}



		repaint();

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub

		super.paintComponent(g);
		g.setColor(   c    );
		g.fillOval(x, y, 50, 50);
	}

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setContentPane(new BollTest(Color.pink));
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.pack();

	}
}

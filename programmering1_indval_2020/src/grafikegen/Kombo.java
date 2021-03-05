package grafikegen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kombo extends JComponent {


	private int x=200;


	public Kombo() {

		this.setPreferredSize(new Dimension(500,500));

	}
	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.setColor(new Color(124, 243, 213));
		g.fillRect(x, 200, 50, 50);
	}

	public void move() {

		x=400;
		repaint();

	}


	public static void main(String[] args) {


		JFrame f = new JFrame();
		JButton b = new JButton("move");
		JPanel p = new JPanel();
		Kombo KomboObjekt=new Kombo();
		p.setLayout(new FlowLayout());

		b.addActionListener(e->{

			//KomboObjekt.x=400;
			//KomboObjekt.repaint();

			KomboObjekt.move();

		});


		p.add(b);
		p.add(KomboObjekt);
		f.add(p);
		f.setVisible(true);
		f.pack();
	}
}

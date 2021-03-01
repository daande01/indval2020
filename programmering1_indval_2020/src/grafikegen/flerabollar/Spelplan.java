package grafikegen.flerabollar;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Spelplan extends JComponent {


	Boll [] bollar=new Boll[100];






	public Spelplan() {




		for (int i = 0; i < bollar.length; i++) {

			bollar[i] = new Boll((int) (Math.random()*500),
					   			 (int) (Math.random()*500),
					   			 2,
					   			 2,
					   			new Color(255, 255, 255),
					   			 30);

		}




		Timer t1=new Timer(30, e->{

			for (int i = 0; i < bollar.length; i++) {

			bollar[i].update();

			}
			repaint();

		});
		t1.start();


	}





	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		for (int i = 0; i < bollar.length; i++) {


		bollar[i].rita(g);
		}
	}

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setContentPane(new Spelplan());
		f.setVisible(true);
		f.setSize(500,500);




	}


}

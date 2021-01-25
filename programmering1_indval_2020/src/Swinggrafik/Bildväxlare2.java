package Swinggrafik;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bildväxlare2 extends JFrame {

	private JLabel bild= new JLabel(new ImageIcon("bilder//cat-1107450_640.jpg"));

	private JButton change =new JButton("växlabild");



	public Bildväxlare2() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(1000,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(bild);
		add(change);

		change.addActionListener(e->{





			if (bild.getIcon().toString().equals("bilder//cat-1107450_640.jpg")) {

				bild.setIcon(new ImageIcon("bilder//cat-3431519_640.jpg"));

			}else {

				bild.setIcon(new ImageIcon("bilder//cat-1107450_640.jpg"));
			}



		});


	}


	public static void main(String[] args) {

		new Bildväxlare2();
	}


}

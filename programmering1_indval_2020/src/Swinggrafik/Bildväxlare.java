package Swinggrafik;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bildväxlare extends JFrame {

	private JLabel bild= new JLabel(new ImageIcon("bilder//bild1.jpg"));

	private JButton change =new JButton("växlabild");

	int i =0;

	public Bildväxlare() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(1000,1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		add(bild);
		add(change);

		change.addActionListener(e->{


			if(i==0) {

				bild.setIcon(new ImageIcon("bilder//cat-3431519_640.jpg"));
				i=1;
			}else if(i==1) {

				bild.setIcon(new ImageIcon("bilder//cat-1107450_640.jpg"));
				i=0;
			}

		});


	}


	public static void main(String[] args) {

		new Bildväxlare();
	}


}

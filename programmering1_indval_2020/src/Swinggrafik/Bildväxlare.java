package Swinggrafik;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bildväxlare extends JFrame {

	private JLabel bild= new JLabel(new ImageIcon("bilder//cat-1107450_640.jpg"));

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


			System.out.println(bild.getIcon().toString());


			if ("bilder//cat-1107450_640.jpg"==bild.getIcon().toString())

			bild.setIcon(new ImageIcon("bilder//cat-3431519_640.jpg"));


		});


	}


	public static void main(String[] args) {

		new Bildväxlare();
	}


}

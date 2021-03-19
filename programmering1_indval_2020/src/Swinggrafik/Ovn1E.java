package Swinggrafik;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ovn1E extends JFrame {

		JButton b1=new JButton("klicka");
		JLabel  l=new JLabel();

	public Ovn1E() {

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(200,200);
		add(b1);
		add(l);

		b1.addActionListener(e->{

			l.setText("du har klickat");

		});




	}


	public static void main(String[] args) {

	new Ovn1E();

	}




}

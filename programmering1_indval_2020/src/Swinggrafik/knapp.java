package Swinggrafik;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class knapp extends JFrame {

	JLabel l1 = new JLabel("hej"); //


	public knapp(){  // konstruktor

		setLayout(new FlowLayout());
		setSize(400,400);
		add(l1);
		setVisible(true);


	}



	public static void main(String[] args) {


		new knapp();
		new knapp();

	}



}

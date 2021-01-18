package Swinggrafik;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Textruta extends JFrame {

	JTextField t1 = new JTextField(20);
	JLabel     l1 = new JLabel();

	public Textruta() {

		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
		add(t1);
		add(l1);

		t1.addActionListener(e->{

			String value =t1.getText();

			l1.setText(value);

		});


	}

	public static void main(String[] args) {

		new Textruta();

	}

}

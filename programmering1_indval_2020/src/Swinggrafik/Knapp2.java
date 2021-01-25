package Swinggrafik;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Knapp2 extends JFrame {

	private JLabel l1 = new JLabel("hej");
	private JButton b1 = new JButton("ändra text");

	public Knapp2() {

		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.setSize(200, 200);
		this.add(l1);
		add(b1);

		b1.addActionListener(e -> {

			l1.setText("hej då");

		});

	}

	public static void main(String[] args) {

		new Knapp2();

	}

}

package Swinggrafik;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Radiobuttontest extends JFrame {

	JLabel l1 = new JLabel("hund");
	JLabel l2 = new JLabel("katt");
	JLabel l3 = new JLabel("häst");

	JButton send = new JButton("send");

	JRadioButton b1 = new JRadioButton();
	JRadioButton b2 = new JRadioButton();
	JRadioButton b3 = new JRadioButton();
	ButtonGroup buttons = new ButtonGroup();

	public Radiobuttontest() {

		setLayout(new FlowLayout());
		setSize(400, 400);
		setVisible(true);

		buttons.add(b1);
		buttons.add(b2);
		buttons.add(b3);
		add(l1);
		add(b1);
		add(l2);
		add(b2);
		add(l3);
		add(b3);
		add(send);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		send.addActionListener(e -> {

			if (b1.isSelected()) {
				send.setText("hund");
			} else if (b2.isSelected()) {
				send.setText("katt");
			}
			if (b3.isSelected()) {
				send.setText("häst");
			}

		});

	}

	public static void main(String[] args) {

		new Radiobuttontest();

	}

}

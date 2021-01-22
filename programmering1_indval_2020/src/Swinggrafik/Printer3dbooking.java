package Swinggrafik;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Printer3dbooking extends JFrame {

	JLabel l1 = new JLabel("printer1");
	JLabel l2 = new JLabel("printer2");
	JLabel l3 = new JLabel("printer3");

	JButton send = new JButton("send");

	JRadioButton b1 = new JRadioButton();
	JRadioButton b2 = new JRadioButton();
	JRadioButton b3 = new JRadioButton();
	ButtonGroup buttons = new ButtonGroup();

	private JTextField start = new JTextField(20);
	private JTextField end = new JTextField(20);
	private JLabel message = new JLabel();


	public Printer3dbooking() {

		setLayout(new FlowLayout());
		setSize(270, 400);
		setVisible(true);

		buttons.add(b1);
		buttons.add(b2);
		buttons.add(b3);
		add(start);
		add(end);
		add(l1);
		add(b1);
		add(l2);
		add(b2);
		add(l3);
		add(b3);
		add(send);

		add(message);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		send.addActionListener(e->{

			String printer="";

			if (b1.isSelected()) {
				printer="skrivare 1";
			} else if (b2.isSelected()) {
				printer="skrivare 2";
			}
			if (b3.isSelected()) {
				printer="skrivare 3";
			}


			message.setText("du har valt skrivare "+printer+" starttid "+start.getText()+"sluttid"+end.getText());



		});



	}




	public static void main(String[] args) {


			new Printer3dbooking();


	}

}

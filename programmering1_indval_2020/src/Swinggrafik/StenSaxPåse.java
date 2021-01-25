package Swinggrafik;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class StenSaxPåse extends JFrame{

		private JButton stenSpelare = new JButton("sten");
		private JButton saxSpelare = new JButton("sax");
		private JButton påseSpelare = new JButton("påse");

		private JButton stenDator = new JButton("sten");
		private JButton saxDator = new JButton("sax");
		private JButton påseDator = new JButton("påse");
		int spelarVal;

	public StenSaxPåse() {

		stenDator.setBackground(Color.pink);
		saxDator.setEnabled(false);
		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(stenSpelare);
		add(saxSpelare);
		add(påseSpelare);
		add(stenDator);
		add(saxDator);
		add(påseDator);


		stenSpelare.addActionListener(e->{
			spelarVal=1;
			vinnare();

		});
		saxSpelare.addActionListener(e->{
			spelarVal=2;
			vinnare();
		});
		påseSpelare.addActionListener(e->{
			spelarVal=3;
			vinnare();
		});


	}

	public void vinnare() {

		// implementera spelet utifrån de regler som finns för spelet


	}







	public static void main(String[] args) {

			new StenSaxPåse();
	}

}

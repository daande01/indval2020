package Swinggrafik;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class knapp extends JFrame {

	JButton b1 = new JButton("+");
	JButton b2 = new JButton("-");
	private int tal = 0;
	JLabel l1 = new JLabel("" + tal);

	public knapp() { // konstruktor

		setLayout(new FlowLayout());
		setSize(400, 400);
		add(l1);
		add(b1);
		add(b2);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		b1.addActionListener(e -> {
			tal++;
			l1.setText("" + tal);
			// skriv om denna lyssnare, skall �ka v�rdet p� instansvariabeln tal samt l�gga
			// in tal i jlabeln l1 med metoden setText(""+tal)

		});
		b2.addActionListener(e -> {
			tal--;
			l1.setText("" + tal);

		});

		// skapa en lyssnare till f�r "knapp2"
		// Denna lyssnare skall minska v�rdet p� instansvariabeln tal samt l�gga in tal
		// i jlabeln l1 med metoden setText()

	}

	public static void main(String[] args) {

		new knapp();
		new knapp();

	}

}

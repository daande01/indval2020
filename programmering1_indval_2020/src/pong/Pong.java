package pong;

import javax.swing.JFrame;

public class Pong extends JFrame {


	public Pong() {

		setContentPane(new Plan());
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);


	}

	public static void main(String[] args) {

		new Pong();
	}


}

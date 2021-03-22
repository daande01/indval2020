package grafikegen;

import javax.swing.JFrame;

public class MonsterMain {


	public static void main(String[] args) {

		JFrame f= new JFrame();
		f.setVisible(true);
		f.setContentPane(new Monster());
		f.pack();
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

	}

}

package prov2;

import javax.swing.JOptionPane;

public class Upp3 {

	public static void main(String[] args) {

		int �r = 0;

		String stringV�rde = JOptionPane.showInputDialog("angemaskin v�rde vid ink�p");

		double maskinV�rde = Integer.parseInt(stringV�rde);

		while (maskinV�rde > 1000) {

			maskinV�rde = maskinV�rde * 0.8;
			�r = �r + 1;

		}


		System.out.println(maskinV�rde+" �r"+�r);

	}

}

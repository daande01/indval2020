package prov2;

import javax.swing.JOptionPane;

public class Upp3 {

	public static void main(String[] args) {

		int år = 0;

		String stringVärde = JOptionPane.showInputDialog("angemaskin värde vid inköp");

		double maskinVärde = Integer.parseInt(stringVärde);

		while (maskinVärde > 1000) {

			maskinVärde = maskinVärde * 0.8;
			år = år + 1;

		}


		System.out.println(maskinVärde+" år"+år);

	}

}

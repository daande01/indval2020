package prov2;

import javax.swing.JOptionPane;

public class Upp2 {








	public static void main(String[] args) {

		int v =kubVolym(1,2,3);

		JOptionPane.showMessageDialog(null, "volym är"+v );

		String ord=särskriv("polis", "bil" );

		System.out.println(ord);

	}

	public static String särskriv(String string, String string2) {

		String s = string+string2;

		return s;


	}

	public static int kubVolym(int i, int j, int k) {


		int volym= i*j*k;

		return volym;
	}


}

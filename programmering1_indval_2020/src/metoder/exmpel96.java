package metoder;

import java.util.Scanner;

public class exmpel96 {

	static int antal;

	public static void main(String[] args) {

		double[] tid =new double[100];  // skapar en array

		inTid(tid); // anropar metoden inTid och skickar med arrayen tid som inparameter.

		utTid(tid);

		System.out.println(snabbastTid(tid));

	}


	/*
	 * tar emot en array av datatypen double. anv�ndaren ombeds att
	 * mata in v�rden genom system.in som sedan lagras i arrayen.
	 * inmatningen stoppas genom att anv�ndaren matar in en nolla.
	 *
	 *
	 */

	private static void inTid(double[] tid) {

		Scanner scan= new Scanner(System.in);

		System.out.println("skriv in tiderna, avsluta med 0");

		antal=0;

		double temp;

		do {
			temp= scan.nextDouble();
			tid[antal]=temp;
			antal++;


		}while(temp !=0);




	}


	/*
	 * loopar ut v�rden som ligger lagrade i tid arrayen. anv�nder sig av den statisk
	 * variabeln antal f�r att h�lla reda p� hur m�nga positioner i arrayen som
	 * �r p� fyllda.
	 *
	 *
	 */

	private static void utTid(double[] tid) {

		System.out.println("tiderna �r ");

		for (int i = 0; i < antal; i++) {
			System.out.print(" "+tid[i]);
		}
		System.out.println();

	}

	public static double snabbastTid(double [] tid) {


		double min = Double.MAX_VALUE;

		for (int i = 0; i < tid.length; i++) {

			if ( min > tid[i]  ) {

				min = tid[i];

			}
		}

		return min;


	}




}

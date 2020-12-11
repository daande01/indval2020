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
	 * tar emot en array av datatypen double. användaren ombeds att
	 * mata in värden genom system.in som sedan lagras i arrayen.
	 * inmatningen stoppas genom att användaren matar in en nolla.
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
	 * loopar ut värden som ligger lagrade i tid arrayen. använder sig av den statisk
	 * variabeln antal för att hålla reda på hur många positioner i arrayen som
	 * är på fyllda.
	 *
	 *
	 */

	private static void utTid(double[] tid) {

		System.out.println("tiderna är ");

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

package loopar;

import java.util.Scanner;

public class repetition3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int val=0;
		do {

			System.out.println("1.boka tid \n2.ange regnummer \n3.av boka \n4.avsluta");

			 val = sc.nextInt();

			switch (val) {
			case 1:

				repetition3.bokaTid();

				break;
			case 2:

				angeReg();

				break;

			case 3:

				avBoka();

				break;
			case 4:

				System.out.println("välkommen åter");

				break;
			default:

				break;
			}

		} while (val !=4);

	}

	public static void bokaTid() {

		System.out.println("du har valt boka tid");

	}

	public static void angeReg() {

		System.out.println("ange reg");

	}

	public static void avBoka() {

		System.out.println("avboka");

	}

}

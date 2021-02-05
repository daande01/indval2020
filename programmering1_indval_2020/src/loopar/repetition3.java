package loopar;

import java.util.Scanner;

public class repetition3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1.boka tid \n2.ange regnummer \n3.av boka");

		int val = sc.nextInt();

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
		default:

			break;
		}


	}

	public static void bokaTid() {


		System.out.println("du har valt boka tid");


	}
	public static void angeReg() {

		System.out.println("ange reg");

	}
	public static void avBoka() {


	}



}

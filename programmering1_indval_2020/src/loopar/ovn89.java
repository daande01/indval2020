package loopar;

import java.util.Scanner;

public class ovn89 {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		int val;
		do {
			System.out.println("MENY\n 1. Insättning\n 2. Uttag\n 3. Visa behållning\n 4. Avsluta");

			 val = sc.nextInt();

			switch (val) {
			case 1:
				System.out.println("in");
				break;
			case 2:
				System.out.println("out");
				break;
			case 3:
				System.out.println("saldo");
				break;
			case 4:
				System.out.println("avsluta");
				break;

			default:
				break;
			}


		}while (val != 4);
	}

}

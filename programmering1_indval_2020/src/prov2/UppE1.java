package prov2;

import java.util.Scanner;

public class UppE1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int summa=0;


		for (int i = 0; i < 5; i++) { // start, vilkor, förändring
			System.out.println("ange heltal ");

			 summa = summa + sc.nextInt();



			 	//1 = 0 + 1
			 	//3=1 + 2
			 	// 6 = 3+3
			    // 10=6+  4
			  //   15=10+5

		}

		System.out.println(summa);

		double medel= summa/5.0;

		System.out.println(medel);

	}

}

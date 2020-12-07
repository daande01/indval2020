package metoder;

import java.util.Scanner;

public class exmpel96 {

	static int antal;

	public static void main(String[] args) {

		double[] tid =new double[100];

		inTid(tid);

		utTid(tid);
		
		System.out.println(snabbastTid(tid));

	}

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

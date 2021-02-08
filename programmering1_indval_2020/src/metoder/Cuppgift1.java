package metoder;

import java.util.Scanner;

public class Cuppgift1 {


	public static void main(String[] args) {


		String text ="00650066";



		for (int i = 0; i < text.length(); i=i+4) {


			String s = text.substring(i,i+4);

			int k=Integer.parseInt(s);

			char ccc= (char)k;
			System.out.println(ccc);


		}



		Scanner sc = new Scanner(text);


		while( sc.hasNextInt()) {

			int f =sc.nextInt();

			char c = (char)f;
			//System.out.println(c);


		}





		String mening = "hej mitt namn är daniel";

		for (int i = 0; i < args.length; i++) {



		char cc = mening.charAt(0);
		//System.out.println(cc);

		}






		int i=65;

		char c = (char) i;

		//System.out.println(""+c);








		String idag=java.time.LocalDateTime.now().toString();


		String månad =idag.substring(5,7);

		 int månadInt = Integer.parseInt(månad);

		//System.out.println(månad);


		//19820205

	}


	//skapa en metod som tar personnummer som inparameter och som returnerar hur många dagar det är kvar tills man fyller år.
	//följande kod ger System.out.println(java.time.LocalDateTime.now());
	//2017-01-24T00:03:31.593





}

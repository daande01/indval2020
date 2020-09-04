import java.util.Scanner;

public class Exempel02_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Skriv namn :");
		String namn = input.nextLine();

		System.out.println("ange ålder:");

		int ålder = input.nextInt();

		System.out.println("ange längd:");

		double längd = input.nextDouble();


		System.out.println(namn+" "+ålder+" "+längd);

	}

}

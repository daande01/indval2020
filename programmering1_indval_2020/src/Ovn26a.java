import java.util.Scanner;

public class Ovn26a {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("hur mycket vill du ta ut");

		int belopp = sc.nextInt();

		int uttag = ((belopp+99)/100)*100;

		System.out.print("uttag:" + uttag);

	}



}

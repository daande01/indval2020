import java.util.Scanner;

public class Ovn23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ange din ålder");
		int age=sc.nextInt();

		int i =(int) (age/10.0)*10 +10;

		int årKvar= i-age;

		System.out.println("du fyller"+i+" om"+årKvar+"år");


	}

}

import java.util.Scanner;

public class Ovn24 {

	public static void main(String[] args) {

		int a, b, c;
		Scanner sc = new Scanner(System.in);

		System.out.println("ange ett tal");

		a=sc.nextInt();

        System.out.println("ange ett tal");

		b=sc.nextInt();

		System.out.println("ange ett tal");

		c=sc.nextInt();

		int summa = a+b+c;

		double medel= summa/ 3.0;

		System.out.println("summa:"+summa+" medel:"+medel);



	}


}

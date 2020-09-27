import java.util.Scanner;

public class Ovn26b {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("hur mycket vill du ta ut"); // 670

		int belopp = sc.nextInt()+99;   //769

		int femHundra= (belopp/500);    //1

		int rest= belopp-femHundra*500;  // 269

		int hundra = ((rest)/100);

		System.out.print("hundra:"+hundra+"\nfemhundra"+femHundra);

	}
}

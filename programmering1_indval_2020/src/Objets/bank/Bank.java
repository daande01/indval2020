package Objets.bank;

public class Bank {





	public static void main(String[] args) {

		Person p1 = new Person(1982, "daniel");
		Person p2 = new Person(1919, "g�ran");

		p1.konton[0]= new Konto(1);

		p1.konton[0].inst�ttning(500);
		int saldo=p1.konton[0].uttag(200);
		System.out.println(saldo);

	}
}

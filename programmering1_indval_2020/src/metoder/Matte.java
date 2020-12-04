package metoder;

public class Matte {

	public static void main(String[] args) {


			sub(23,4);

			int number=multi();
			System.out.println(number*2);
			Matte.sum(30, 30);
	}




	public static void sub(int tal1, int tal2) {

		int subtraktion=tal1-tal2;

		System.out.println(subtraktion);

	}

	public static int multi() {

		return 2;
	}

	public static void sum(int tal1, int tal2) {

		int summa=tal1+tal2;

		System.out.println(summa);

	}



}

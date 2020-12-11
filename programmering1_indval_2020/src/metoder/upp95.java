package metoder;

public class upp95 {


	public static void main(String[] args) {


		System.out.println(siffra('4'));

	}



	public static boolean siffra(char tecken) {


		int i = tecken;
		System.out.println(i);

		if (i>47 && i<58) {

			return true;

		}else {

			return false;
		}





	}


}

package metoder;

public class upp94 {


	public static void main(String[] args) {


		System.out.println(upp94.tecken(0));


	}




	public static char tecken(double tal) {


		if(tal >0 ) {

			return '+';

		}if (tal <0) {


			return '-';
		}

		return '0';

	}


}

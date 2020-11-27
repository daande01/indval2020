package loopar;

public class Wordmirror {

	public static void main(String[] arg) {

	String word="paris"; // 0,1,2,3,4
	String backWards="";

	for(int i=4;i>=0;i--) {


		backWards=backWards+""+word.charAt(i);


	}

		System.out.println(backWards);

	}
}

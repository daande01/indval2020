package prov2;

public class upp2c {



	public static String slumpatDjur() {

		String [] djur= {"hund","katt","elefant" };

		 int slumptal = (int)  ( Math.random()*3);

		 return djur[slumptal];

	}


	public static void main(String[] args) {

		System.out.println(   slumpatDjur()  );

	}



}

package Objets;

public class Bil {

	private String färg; // instansvariabel , medlemsvariabel, objektsvariabel
	private int effekt;  // instansvariabel
	private int hastighet;  // instansvariabel


	public Bil() {  // konstruktor

		färg="pink";
		effekt=200;
		hastighet=0;

		System.out.println(färg+" "+effekt+" "+hastighet);

	}
	public Bil(String f,int e , int h) {   // konstruktor med inparametrar

		färg=f;
		effekt=e;
		hastighet=h;

	}

	public void bytfärg() {   // instansmetod

		färg="green";

	}
	public void printInfo() {
		System.out.println(färg+" "+effekt+" "+hastighet);
	}


	public static void main(String[] args) {

		Bil b1 = new Bil("blue",23,37); // referensvariabel b1 av typen bil och lagrat en bil i en
		Bil b2 = new Bil();
		b1.bytfärg();
		b1.printInfo();
		b2.printInfo();

	}



}

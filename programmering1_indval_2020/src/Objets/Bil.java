package Objets;

public class Bil {

	private String f�rg; // instansvariabel , medlemsvariabel, objektsvariabel
	private int effekt;  // instansvariabel
	private int hastighet;  // instansvariabel


	public Bil() {  // konstruktor

		f�rg="pink";
		effekt=200;
		hastighet=0;

		System.out.println(f�rg+" "+effekt+" "+hastighet);

	}
	public Bil(String f,int e , int h) {   // konstruktor med inparametrar

		f�rg=f;
		effekt=e;
		hastighet=h;

	}

	public void bytf�rg() {   // instansmetod

		f�rg="green";

	}
	public void printInfo() {
		System.out.println(f�rg+" "+effekt+" "+hastighet);
	}


	public static void main(String[] args) {

		Bil b1 = new Bil("blue",23,37); // referensvariabel b1 av typen bil och lagrat en bil i en
		Bil b2 = new Bil();
		b1.bytf�rg();
		b1.printInfo();
		b2.printInfo();

	}



}

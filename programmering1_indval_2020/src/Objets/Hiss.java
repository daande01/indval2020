package Objets;

import javax.swing.JOptionPane;

public class Hiss {

	private int våning ; // instansvariabel
	private int riktning;

	public Hiss() {

		våning=0;
		riktning=0;

		System.out.println("v:"+våning +" r:"+ riktning);

	}

	public Hiss(boolean b) {

		våning = Integer.parseInt(     JOptionPane.showInputDialog("installations våning")   );
		riktning=0;
		System.out.println("v:"+våning +" r:"+ riktning);
	}

	 public void körTillVåning(int v){

		 våning=v;

	}

	public int getVåning() {
		 return våning;

	}


	public static void main(String[] args) {

	Hiss h1= new Hiss();	 // skapar referens variabel samt lagrar ett hiss objekt i denna variabel.

	Hiss h2= new Hiss(true);

	h1.körTillVåning(5);

	int h1v=h1.getVåning();

	System.out.println("v:"+h1v);
	}


}

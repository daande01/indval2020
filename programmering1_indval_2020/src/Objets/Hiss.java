package Objets;

import javax.swing.JOptionPane;

public class Hiss {

	private int v�ning ; // instansvariabel
	private int riktning;

	public Hiss() {

		v�ning=0;
		riktning=0;

		System.out.println("v:"+v�ning +" r:"+ riktning);

	}

	public Hiss(boolean b) {

		v�ning = Integer.parseInt(     JOptionPane.showInputDialog("installations v�ning")   );
		riktning=0;
		System.out.println("v:"+v�ning +" r:"+ riktning);
	}

	 public void k�rTillV�ning(int v){

		 v�ning=v;

	}

	public int getV�ning() {
		 return v�ning;

	}


	public static void main(String[] args) {

	Hiss h1= new Hiss();	 // skapar referens variabel samt lagrar ett hiss objekt i denna variabel.

	Hiss h2= new Hiss(true);

	h1.k�rTillV�ning(5);

	int h1v=h1.getV�ning();

	System.out.println("v:"+h1v);
	}


}

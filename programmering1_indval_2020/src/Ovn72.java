import javax.swing.JOptionPane;

public class Ovn72 {

	public static void main(String[] args) {

		int tanken= 50;
		double prisPerLiter=9.5;

		String inl�stData=JOptionPane.showInputDialog("hur mycket etanol har du kvar i tanken");

		int etanolKvar=Integer.parseInt(inl�stData);

		if (etanolKvar>10) {

			System.out.println("k�r vidare");

		} else {

			int m�ngd= tanken-etanolKvar;
			int kostnad=(int)((m�ngd*prisPerLiter) +0.5);

			System.out.println("b�r tanka, m�ngd:"+m�ngd+"\nkostnad:"+kostnad);

		}






























	}




}

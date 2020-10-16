import javax.swing.JOptionPane;

public class Ovn72 {

	public static void main(String[] args) {

		int tanken= 50;
		double prisPerLiter=9.5;

		String inlästData=JOptionPane.showInputDialog("hur mycket etanol har du kvar i tanken");

		int etanolKvar=Integer.parseInt(inlästData);

		if (etanolKvar>10) {

			System.out.println("kör vidare");

		} else {

			int mängd= tanken-etanolKvar;
			int kostnad=(int)((mängd*prisPerLiter) +0.5);

			System.out.println("bör tanka, mängd:"+mängd+"\nkostnad:"+kostnad);

		}






























	}




}

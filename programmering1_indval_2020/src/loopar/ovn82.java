package loopar;

import javax.swing.JOptionPane;

public class ovn82 {

	public static void main(String[] args) {

		String sTal =JOptionPane.showInputDialog("ange start");
		int start=Integer.parseInt(sTal);

		sTal =JOptionPane.showInputDialog("ange slut");
		int slut=Integer.parseInt(sTal);

		sTal =JOptionPane.showInputDialog("ange slut");
		int förändring=Integer.parseInt(sTal);

		for(int i=start;i<=slut;i=i+förändring ) {

			System.out.println(i);

		}

	}


}

import javax.swing.JOptionPane;

public class Omvadling1 {

	public static void main(String[] args) {

		String tal = JOptionPane.showInputDialog("ange ett tal som skall kvadreras");

		//double dtal = Double.parseDouble(tal);
		int inttal= Integer.parseInt(tal);

		double svar =inttal * inttal;

		System.out.println(svar);

	}

}

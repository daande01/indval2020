import javax.swing.JOptionPane;

public class Omvadling1 {

	public static void main(String[] args) {

		String tal = JOptionPane.showInputDialog("ange ett tal som skall kvadreras");

		double inttal = Double.parseDouble(tal);

		double svar =inttal * inttal;

		System.out.println(svar);

	}

}

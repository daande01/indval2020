package loopar;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class for1 {

	public static void main(String[] args) {

		int[] temp = new int[5]; // 0,1,2,3,4

		for (int i = 0; i < 5; i++) {

			String stringTemp = JOptionPane.showInputDialog("ange temp");

			temp[i] = Integer.parseInt(stringTemp);

		}

		System.out.println(Arrays.toString(temp));

		double summa = 0;

		for (int i = 0; i < temp.length; i++) {

			summa = summa + temp[i];
		}

		double medelTemp = summa / temp.length;

		System.out.println(medelTemp);

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < temp.length; i++) {

			if (max < temp[i]) {
				max = temp[i];
			}

		}
		System.out.println(max);

	}

}

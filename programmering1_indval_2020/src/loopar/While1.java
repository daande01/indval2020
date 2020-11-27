package loopar;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class While1 {

	public static void main(String[] args) {

		int[] temp = new int[5]; // 0,1,2,3,4


		int i =0;
		while( i < 5) {
			String stringTemp = JOptionPane.showInputDialog("ange temp");

			temp[i] = Integer.parseInt(stringTemp);
			i++;
		}

		System.out.println(Arrays.toString(temp));


	}


}

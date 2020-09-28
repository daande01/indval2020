package arrayer;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Arr3 {

	public static void main(String[] args) {

		int [] f = new int [5];


		for(int i=0; i<=4; i++) {

			String s1=JOptionPane.showInputDialog("ange ett tal");
			f[i]= Integer.parseInt(s1);
		}


		System.out.println(Arrays.toString(f));
	}




}

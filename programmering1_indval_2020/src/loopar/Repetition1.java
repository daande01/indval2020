package loopar;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Repetition1 {

	public static void main(String[] args) {


		int [] i=new int [3]; // 0,1,2,3,4

		for(int k=0; k<i.length; k++) {


			String s=JOptionPane.showInputDialog("ange ett tal");

			i[k]=Integer.parseInt(s);
		}

		System.out.println(Arrays.toString(i));

		int g=0;
		int summa=0;
		while(g<i.length) {

			summa=summa+i[g];

			g++;

		}

		System.out.println(summa);

	}



}

package loopar;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class input {

	public static void main(String[] args) {

		int []arr=new int[10];

		int i=0;

		while(i<10) {
			String sTal =JOptionPane.showInputDialog("ange ett tal");
			arr[i]=Integer.parseInt(sTal);
			i++;
		}
		System.out.println(Arrays.toString(arr));

	}


}

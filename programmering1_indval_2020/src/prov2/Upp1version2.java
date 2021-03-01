package prov2;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Upp1version2 {

	public static void main(String[] args) {

		int[] arr = new int[3];

		for (int i = 0; i < 3; i++) {

			String s = JOptionPane.showInputDialog("ange ett heltal");

			int tal = Integer.parseInt(s);

			arr[i] = tal;

		}

		System.out.println(Arrays.toString(arr));


		for (int i = 0; i < arr.length; i++) {

			System.out.println("tal på pos"+i+"är"+arr[i]);

		}



	}

}

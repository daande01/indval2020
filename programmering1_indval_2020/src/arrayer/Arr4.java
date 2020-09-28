package arrayer;

import java.util.Arrays;

public class Arr4 {


	public static void main(String[] args) {

		int a []= {2,4,5,6};
		int b []= {2,4,5,6};
		int c []= new int[4];

		for (int i = 0; i < c.length; i++) {
			c[i]=a[i]+ b[i];
		}



		System.out.println(Arrays.toString(c));

	}


}

package metoder;

import java.util.Arrays;

public class Metoderarrayer {




	public static void main(String[] args) {

	 	int [] i = {1,2,3,45,6,7,87,888};  //1

		int g=6;
		printArray(i,g);  //2
		System.out.println("g:"+g);
		System.out.println(Arrays.toString(i)); //3


	}

	public static void printArray(int [] b, int g) {

		for (int i = 0; i < b.length; i++) {

			System.out.println("pos"+i+" värde :"+b[i]);

		}

		b[0]=1000000;
		g=10000;

	}








}

package arrayer;

import java.util.Arrays;
import java.util.Scanner;

public class Arr1 {

	public static void main(String[] args) {

		int[] a=new int[10];

		Scanner sc = new Scanner(System.in);





		for(int i=0; i<5; i=i+1) {   //startvärde; villkorsvärd,förändrinsvärde

			System.out.println("ange ett tal");
			a[i]= sc.nextInt();


		}

		System.out.println(Arrays.toString(a));



		//System.out.println(Arrays.toString(a));





	}



}

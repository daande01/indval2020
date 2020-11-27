package loopar;

public class ovn841 {

	public static void main(String[] args) {


		int min = Integer.MAX_VALUE;
		int [] arr= {67,34,5,56,78,6,9};


		for (int i = 0; i < arr.length; i++) {

			if(arr[i]<min) {

				min=arr[i];

			}

		}
		System.out.println(min);





	}




}

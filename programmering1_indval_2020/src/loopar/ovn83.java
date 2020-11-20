package loopar;

public class ovn83 {

	public static void main(String[] args) {

		int [] meterPerSekund=new int [8];

		for(int i=0;i<8;i++) {

			meterPerSekund[i]=5*(i+1);


		}
		//System.out.println(Arrays.toString(meterPerSekund));
		System.out.println("m/s\tkm/t");
		for (int i = 0; i < meterPerSekund.length; i++) {

			System.out.print(meterPerSekund[i]+" \t");
			System.out.println(meterPerSekund[i]*3.6);
		}



	}
}

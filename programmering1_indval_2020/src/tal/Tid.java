package tal;

public class Tid {

	public static void main(String[] args) {

		int tidISekunder =7261;


		int timmar = tidISekunder/3600;   /// 2

		int rest = tidISekunder-(timmar*3600);  // 61

		// int rest = tidISekunder % 3600;

		int minuter = rest / 60;     // 1 minut

		int sekunder = rest% 60;    // 1 sekund



	}


}

package kotitehtävä9;

public class KT5 {
	public static void main(String[] args) {
		int[] sales2014 = {500, 720, 515, 377, 400, 435, 510, 1010, 894, 765, 998, 1125};
		int[] staff2014 = {7, 5, 5, 5, 5, 6, 6, 7, 7, 8, 9, 9};
		int[] salesPerStaff = new int[12];
		int totalSales2014 = 0;
		
		// Lasketaan myynti henkilöä kohden jokaiselle kuukaudelle
		for (int i = 0; i < salesPerStaff.length; i++) {
			salesPerStaff[i] = sales2014[i] / staff2014[i];
			totalSales2014 += sales2014[i];
			System.out.println("Kuukausi " + (i+1) + ": " + salesPerStaff[i]);
		}

		System.out.println("Vuoden 2014 kokonaismyynti: " + totalSales2014);

	}
}

	


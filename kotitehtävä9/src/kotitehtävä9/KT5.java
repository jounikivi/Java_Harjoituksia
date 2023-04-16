package kotitehtävä9;

public class KT5 {
	public static void main(String[] args) {
		int[] sales2014 = {500, 720, 515, 377, 400, 435, 510, 1010, 894, 765, 998, 1125};
		int[] staff2014 = {7, 5, 5, 5, 5, 6, 6, 7, 7, 8, 9, 9};
		int[] salesPerStaff = new int[12];
		int totalSales2014 = 0;
		
		// Lasketaan myynti henkilöä kohden jokaiselle kuukaudelle
		salesPerStaff[0] = sales2014[0] / staff2014[0];
		salesPerStaff[1] = sales2014[1] / staff2014[1];
		salesPerStaff[2] = sales2014[2] / staff2014[2];
		salesPerStaff[3] = sales2014[3] / staff2014[3];
		salesPerStaff[4] = sales2014[4] / staff2014[4];
		salesPerStaff[5] = sales2014[5] / staff2014[5];
		salesPerStaff[6] = sales2014[6] / staff2014[6];
		salesPerStaff[7] = sales2014[7] / staff2014[7];
		salesPerStaff[8] = sales2014[8] / staff2014[8];
		salesPerStaff[9] = sales2014[9] / staff2014[9];
		salesPerStaff[10] = sales2014[10] / staff2014[10];
		salesPerStaff[11] = sales2014[11] / staff2014[11];

		// Lasketaan vuoden 2014 kokonaismyynti
		totalSales2014 = sales2014[0] + sales2014[1] + sales2014[2] + sales2014[3] + sales2014[4] + sales2014[5] + sales2014[6] + sales2014[7] + sales2014[8] + sales2014[9] + sales2014[10] + sales2014[11];

		System.out.println("Myynti henkilöä kohden jokaiselle kuukaudelle:");
		for (int i = 0; i < salesPerStaff.length; i++) {
		  System.out.println("Kuukausi " + (i+1) + ": " + salesPerStaff[i]);
		}

		System.out.println("Vuoden 2014 kokonaismyynti: " + totalSales2014);

	}
}
	


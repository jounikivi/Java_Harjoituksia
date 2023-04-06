package kotitehtävät2;

public class KT3 {
	public static void main(String[] args) {
		int current = 2;

		// a) 15 ensimmäistä arvoa:
		System.out.println("15 ensimmäistä arvoa:");
		for (int i = 1; i <= 15; i++) {
			System.out.print(current + " ");
			current *= 2;
		}
		System.out.println();

		current = 4;
		// b) arvot, jotka ovat pienempiä kuin 10000:
		System.out.println("Arvot, jotka ovat pienempiä kuin 10000:");
		while (current < 10000) {
			System.out.print(current + " ");
			current *= 2;
		}
		System.out.println();

		// c) kaikki positiiviset neljällä jaolliset luvut, jotka ovat pienempiä kuin 1000:
		System.out.println("Kaikki positiiviset neljällä jaolliset luvut, "
				+ "jotka ovat pienempiä kuin 1000:");
		for (int i = 4; i < 1000; i += 4) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}



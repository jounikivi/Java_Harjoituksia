package kotiteht�v�t2;

public class KT3 {
	public static void main(String[] args) {
		int current = 2;

		// a) 15 ensimm�ist� arvoa:
		System.out.println("15 ensimm�ist� arvoa:");
		for (int i = 1; i <= 15; i++) {
			System.out.print(current + " ");
			current *= 2;
		}
		System.out.println();

		current = 4;
		// b) arvot, jotka ovat pienempi� kuin 10000:
		System.out.println("Arvot, jotka ovat pienempi� kuin 10000:");
		while (current < 10000) {
			System.out.print(current + " ");
			current *= 2;
		}
		System.out.println();

		// c) kaikki positiiviset nelj�ll� jaolliset luvut, jotka ovat pienempi� kuin 1000:
		System.out.println("Kaikki positiiviset nelj�ll� jaolliset luvut, "
				+ "jotka ovat pienempi� kuin 1000:");
		for (int i = 4; i < 1000; i += 4) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}



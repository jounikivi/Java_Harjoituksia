package kotitehtävät3;

import java.util.Scanner;

public class KT3 {
	public static void main(String[] args) {
		int luku = 0;
		int summa = 0;
		while (luku != -1) {
			luku = lueLuku();
			summa += luku;
		}

		tulosta(summa);
	}

	public static int lueLuku() {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Syötä luku: ");
		int luku = lukija.nextInt();
		return luku;
	}

	public static void tulosta(int summa) {
		System.out.println("Lukujen summa on " + summa);
	}
}

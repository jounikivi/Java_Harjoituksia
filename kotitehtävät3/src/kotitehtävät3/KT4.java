package kotitehtävät3;

import java.util.Scanner;

public class KT4 {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);

        int luku1, luku2, luku3, luku4;

        System.out.print("Anna neljä lukua: ");
        luku1 = lukija.nextInt();
        luku2 = lukija.nextInt();
        luku3 = lukija.nextInt();
        luku4 = lukija.nextInt();

        int suurin = luku1;
        if (luku2 > suurin) {
            suurin = luku2;
        }
        if (luku3 > suurin) {
            suurin = luku3;
        }
        if (luku4 > suurin) {
            suurin = luku4;
        }

        int pienin = luku1;
        if (luku2 < pienin) {
            pienin = luku2;
        }
        if (luku3 < pienin) {
            pienin = luku3;
        }
        if (luku4 < pienin) {
            pienin = luku4;
        }

        System.out.println("Suurin luku on " + suurin);
        System.out.println("Pienin luku on " + pienin);
	}
}

package kotiteht‰v‰t3;

import java.util.Arrays;
import java.util.Scanner;

public class KT4 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Alustetaan taulukko nelj‰lle luvulle
        int[] luvut = new int[4];

        // Pyydet‰‰n k‰ytt‰j‰lt‰ nelj‰ lukua ja tallennetaan ne taulukkoon
        for (int i = 0; i < luvut.length; i++) {
            System.out.print("Anna luku: ");
            luvut[i] = lukija.nextInt();
        }

        // Etsit‰‰n taulukon suurin ja pienin luku valmiiden max() ja min() -metodien avulla
        int suurin = Arrays.stream(luvut).max().getAsInt();
        int pienin = Arrays.stream(luvut).min().getAsInt();

        // Tulostetaan suurin ja pienin luku
        System.out.println("Suurin luku on " + suurin);
        System.out.println("Pienin luku on " + pienin);
    }
}

/*package kotiteht‰v‰t3;

import java.util.Scanner;

public class KT4 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // M‰‰ritell‰‰n muuttujat luvuille
        int luku1, luku2, luku3, luku4;

        // Kysyt‰‰n k‰ytt‰j‰lt‰ nelj‰ lukua
        System.out.print("Anna nelj‰ lukua: ");
        luku1 = lukija.nextInt();
        luku2 = lukija.nextInt();
        luku3 = lukija.nextInt();
        luku4 = lukija.nextInt();

        // Alustetaan suurin ja pienin muuttujat ensimm‰iseksi luvuksi
        int suurin = luku1;
        int pienin = luku1;

        // Tarkistetaan, onko jokin muu luvuista suurempi tai pienempi ja p‰ivitet‰‰n suurin/pienin tarvittaessa
        if (luku2 > suurin) {
            suurin = luku2;
        }
        if (luku3 > suurin) {
            suurin = luku3;
        }
        if (luku4 > suurin) {
            suurin = luku4;
        }

        if (luku2 < pienin) {
            pienin = luku2;
        }
        if (luku3 < pienin) {
            pienin = luku3;
        }
        if (luku4 < pienin) {
            pienin = luku4;
        }

        // Tulostetaan suurin ja pienin luku
        System.out.println("Suurin luku on " + suurin);
        System.out.println("Pienin luku on " + pienin);
    }
}*/



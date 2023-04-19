package kotiteht‰v‰t5;

import java.util.Scanner;

public class KT6 {
    // Metodi tarkistaa, ovatko annetut merkkijonot anagrammeja toisilleen
    public static boolean onAnagrammit(String jono1, String jono2) {
        // Jos merkkijonot eiv‰t ole samanpituiset, ne eiv‰t voi olla anagrammeja
        if(jono1.length() != jono2.length()) {
            return false;
        }

        // Taulukot, jotka sis‰lt‰v‰t merkkien esiintymism‰‰r‰n ASCII-koodin mukaisessa indeksiss‰
        int[] kirjaimet1 = new int[256];
        int[] kirjaimet2 = new int[256];

        // K‰yd‰‰n molemmat merkkijonot l‰pi ja lis‰t‰‰n kirjainten esiintymiskerrat taulukoihin
        for(int i = 0; i < jono1.length(); i++) {
            kirjaimet1[(int)jono1.charAt(i)]++;
            kirjaimet2[(int)jono2.charAt(i)]++;
        }

        // K‰yd‰‰n taulukot l‰pi ja tarkistetaan, ovatko kirjainten esiintymiskerrat samat
        for(int i = 0; i < 256; i++) {
            if(kirjaimet1[i] != kirjaimet2[i]) {
                return false;
            }
        }

        // Jos kaikki kirjainten esiintymiskerrat ovat samat, merkkijonot ovat anagrammeja
        return true;
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Syˆt‰ ensimm‰inen merkkijono: ");
        String jono1 = lukija.nextLine();

        System.out.print("Syˆt‰ toinen merkkijono: ");
        String jono2 = lukija.nextLine();

        if (onAnagrammit(jono1, jono2)) {
            System.out.println(jono1 + " ja " + jono2 + " ovat anagrammeja.");
        } else {
            System.out.println(jono1 + " ja " + jono2 + " eiv‰t ole anagrammeja.");
        }
    }
}

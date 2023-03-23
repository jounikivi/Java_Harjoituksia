package kotitehtävät6;

import java.util.Scanner;

public class KT5 {
	public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        /* Kysytään käyttäjältä kaksi lausetta*/
        System.out.print("Syötä ensimmäinen lause: ");
        String lause1 = lukija.nextLine();

        System.out.print("Syötä toinen lause: ");
        String lause2 = lukija.nextLine();

        /* Lasketaan lauseiden sanamäärät*/
        int sanojaLauseessa1 = laskeSanat(lause1);
        int sanojaLauseessa2 = laskeSanat(lause2);

        /*Vertaillaan sanamääriä ja tulostetaan tulos*/
        if (sanojaLauseessa1 > sanojaLauseessa2) {
            System.out.println("Enemmän sanoja löytyi ensimmäisestä lauseesta: " + lause1);
        } else if (sanojaLauseessa2 > sanojaLauseessa1) {
            System.out.println("Enemmän sanoja löytyi toisesta lauseesta: " + lause2);
        } else {
            System.out.println("Lauseissa oli yhtä monta sanaa: " + sanojaLauseessa1);
        }

        lukija.close();
    }

    /* Metodi, joka laskee sanojen määrän annetussa lauseessa*/
    public static int laskeSanat(String lause) {
        Scanner lukija = new Scanner(lause);
        int sanojenMaara = 0;
        while (lukija.hasNext()) {
            lukija.next();
            sanojenMaara++;
        }
        lukija.close();
        return sanojenMaara;
    }
}


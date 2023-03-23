package kotiteht�v�t6;

import java.util.Scanner;

public class KT5 {
	public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        /* Kysyt��n k�ytt�j�lt� kaksi lausetta*/
        System.out.print("Sy�t� ensimm�inen lause: ");
        String lause1 = lukija.nextLine();

        System.out.print("Sy�t� toinen lause: ");
        String lause2 = lukija.nextLine();

        /* Lasketaan lauseiden sanam��r�t*/
        int sanojaLauseessa1 = laskeSanat(lause1);
        int sanojaLauseessa2 = laskeSanat(lause2);

        /*Vertaillaan sanam��ri� ja tulostetaan tulos*/
        if (sanojaLauseessa1 > sanojaLauseessa2) {
            System.out.println("Enemm�n sanoja l�ytyi ensimm�isest� lauseesta: " + lause1);
        } else if (sanojaLauseessa2 > sanojaLauseessa1) {
            System.out.println("Enemm�n sanoja l�ytyi toisesta lauseesta: " + lause2);
        } else {
            System.out.println("Lauseissa oli yht� monta sanaa: " + sanojaLauseessa1);
        }

        lukija.close();
    }

    /* Metodi, joka laskee sanojen m��r�n annetussa lauseessa*/
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


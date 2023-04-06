package kotitehtävät3;

import java.util.Scanner;

public class KT1 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // kutsutaan metodia lueLuku() ja tallennetaan käyttäjän antamat luvut muuttujiin
        int num1 = lueLuku(lukija, "Anna ensimmäinen luku: ");
        int num2 = lueLuku(lukija, "Anna toinen luku: ");

        // kutsutaan metodia laskeSumma() ja tallennetaan laskun tulos muuttujaan
        int summa = laskeSumma(num1, num2);

        // kutsutaan metodia onParillinen() ja tallennetaan sen paluuarvo muuttujaan
        boolean onParillinen = onParillinen(summa);

        // tulostetaan tulos riippuen siitä, onko summa parillinen vai ei
        if (onParillinen) {
            System.out.println("Lukujen summa " + summa + " on parillinen.");
        } else {
            System.out.println("Lukujen summa " + summa + " on pariton.");
        }
    }

    // metodi, joka lukee käyttäjän antaman luvun Scanner-oliota käyttäen
    public static int lueLuku(Scanner sc, String kysymys) {
        System.out.print(kysymys);
        int luku = sc.nextInt();
        return luku;
    }

    // metodi, joka laskee kahden luvun summan
    public static int laskeSumma(int luku1, int luku2) {
        int summa = luku1 + luku2;
        return summa;
    }

    // metodi, joka tarkistaa, onko luku parillinen
    public static boolean onParillinen(int luku) {
        boolean onParillinen = luku % 2 == 0;
        return onParillinen;
    }
}


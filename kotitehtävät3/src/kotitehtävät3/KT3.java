package kotitehtävät3;

import java.util.Scanner;

public class KT3 {
    public static void main(String[] args) {
        int luku = 0;
        int summa = 0;
        
        // while-looppi jatkuu kunnes käyttäjä syöttää luvun -1
        while (luku != -1) {
            luku = lueLuku(); // kutsutaan lueLuku()-metodia ja tallennetaan palautettu luku muuttujaan luku
            summa += luku; // lisätään luku summaan
        }

        tulosta(summa); // kutsutaan tulosta()-metodia annetulla parametrilla summa
    }

    // lueLuku()-metodi lukee käyttäjän syöttämän luvun ja palauttaa sen
    public static int lueLuku() {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syötä luku: ");
        int luku = lukija.nextInt();
        return luku;
    }

    // tulosta()-metodi tulostaa annetun summan käyttäen System.out.println()-metodia
    public static void tulosta(int summa) {
        System.out.println("Lukujen summa on " + summa);
    }
}

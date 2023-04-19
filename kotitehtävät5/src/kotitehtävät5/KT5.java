

import java.util.Scanner;

public class KT5 {
    // Metodi, joka k��nt�� annetun merkkijonon ymp�ri
    public static String takaperin(String jono) {
        String reversed = "";
        // K�yd��n merkkijono l�pi lopusta alkuun ja lis�t��n jokainen merkki reversed-muuttujaan
        for(int i = jono.length() - 1; i >= 0; i--) {
            reversed += jono.charAt(i);
        }
        return reversed;
    }

    // Metodi, joka tarkistaa, onko annettu merkkijono palindromi
    public static boolean onPalindromi(String jono) {
        String reversed = takaperin(jono);
        // Vertaillaan annettua merkkijonoa sen k��nteiseen muotoon
        if(jono.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Sy�t� merkkijono: ");
        String jono = lukija.nextLine();
        // Kutsutaan onPalindromi-metodia ja tulostetaan sen palauttama arvo
        if(onPalindromi(jono)) {
            System.out.println("Merkkijono " + jono + " on palindromi.");
        } else {
            System.out.println("Merkkijono " + jono + " ei ole palindromi.");
        }
    }
}

package kotiteht�v�t3;

import java.util.Scanner;

public class KT3 {
    public static void main(String[] args) {
        int luku = 0;
        int summa = 0;
        
        // while-looppi jatkuu kunnes k�ytt�j� sy�tt�� luvun -1
        while (luku != -1) {
            luku = lueLuku(); // kutsutaan lueLuku()-metodia ja tallennetaan palautettu luku muuttujaan luku
            summa += luku; // lis�t��n luku summaan
        }

        tulosta(summa); // kutsutaan tulosta()-metodia annetulla parametrilla summa
    }

    // lueLuku()-metodi lukee k�ytt�j�n sy�tt�m�n luvun ja palauttaa sen
    public static int lueLuku() {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Sy�t� luku: ");
        int luku = lukija.nextInt();
        return luku;
    }

    // tulosta()-metodi tulostaa annetun summan k�ytt�en System.out.println()-metodia
    public static void tulosta(int summa) {
        System.out.println("Lukujen summa on " + summa);
    }
}

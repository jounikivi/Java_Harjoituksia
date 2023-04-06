package kotitehtävät3;

import java.util.Arrays;
import java.util.Scanner;

public class KT4 {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int[] luvut = new int[4];
        for (int i = 0; i < luvut.length; i++) {
            System.out.print("Anna luku: ");
            luvut[i] = lukija.nextInt();
        }

        // Etsitään taulukon suurin ja pienin luku valmiiden max() ja min() -metodien avulla
        int suurin = Arrays.stream(luvut).max().getAsInt();
        int pienin = Arrays.stream(luvut).min().getAsInt();

        // Tulostetaan suurin ja pienin luku
        System.out.println("Suurin luku on " + suurin);
        System.out.println("Pienin luku on " + pienin);
    }
}


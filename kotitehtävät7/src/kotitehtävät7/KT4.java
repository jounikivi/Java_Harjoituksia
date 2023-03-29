package kotitehtävät7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KT4 {
	public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        try {
            File tiedosto = new File("lukutiedosto.txt");
            Scanner tiedostonLukija = new Scanner(tiedosto);

            System.out.print("Anna rivinumero: ");
            int rivi = lukija.nextInt();

            int haettuLuku = 0;
            for (int i = 1; i < rivi; i++) {
                if (tiedostonLukija.hasNextInt()) {
                    tiedostonLukija.nextInt();
                } else {
                    System.out.println("Tiedosto loppui ennenaikaisesti!");
                    return;
                }
            }
            if (tiedostonLukija.hasNextInt()) {
                haettuLuku = tiedostonLukija.nextInt();
                System.out.println("Haettu luku: " + haettuLuku);
            } else {
                System.out.println("Tiedosto loppui ennenaikaisesti!");
            }
            tiedostonLukija.close();
        } catch (FileNotFoundException e) {
            System.out.println("Tiedostoa ei löytynyt!");
        }
    }
}


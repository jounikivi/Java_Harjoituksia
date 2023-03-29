package kotitehtävät7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KT5 {
	public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        try {
            File tiedosto = new File("kirjoitustiedosto.txt");
            FileWriter kirjoitin = new FileWriter(tiedosto);

            System.out.println("Syötä 10 kokonaislukua:");
            int summa = 0;
            for (int i = 0; i < 10; i++) {
                int luku = lukija.nextInt();
                kirjoitin.write(luku + "\n");
                summa += luku;
            }
            double keskiarvo = (double) summa / 10;
            System.out.println("Lukujen keskiarvo: " + keskiarvo);
            kirjoitin.write("Keskiarvo: " + keskiarvo + "\n");
            kirjoitin.close();
        } catch (IOException e) {
            System.out.println("Tiedostoon kirjoittaminen epäonnistui!");
        }
    }
}


package kotiteht�v�t7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KT6 {
	public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String tiedostonimi = "henkilot.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(tiedostonimi))) {
            for (int i = 0; i < 3; i++) {
                System.out.println("Sy�t� henkil�n " + (i+1) + " nimi:");
                String nimi = lukija.nextLine();
                System.out.println("Sy�t� henkil�n " + (i+1) + " ik�:");
                int ika = Integer.parseInt(lukija.nextLine());
                System.out.println("Sy�t� henkil�n " + (i+1) + " s�hk�postiosoite:");
                String email = lukija.nextLine();

                // Tallenna tiedot tekstitiedostoon
                bw.write(nimi + "," + ika + "," + email);
                bw.newLine();
            }

            System.out.println("Henkil�iden tiedot tallennettu tiedostoon " + tiedostonimi);
        } catch (IOException e) {
            System.out.println("Tiedoston tallennus ep�onnistui: " + e.getMessage());
        }
    }
}

package kotiteht�v�t7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KT7 {
	 public static void main(String[] args) {
	        Scanner lukija = new Scanner(System.in);
	        String tiedostonimi = "henkilot.txt";

	        try (BufferedReader br = new BufferedReader(new FileReader(tiedostonimi))) {
	            String rivi;
	            int i = 1;
	            while ((rivi = br.readLine()) != null) {
	                String[] tiedot = rivi.split(",");
	                System.out.println("Henkil� " + i + ":");
	                System.out.println("Nimi: " + tiedot[0]);
	                System.out.println("Ik�: " + tiedot[1]);
	                System.out.println("S�hk�posti: " + tiedot[2]);
	                i++;
	            }
	        } catch (IOException e) {
	            System.out.println("Tiedoston lukeminen ep�onnistui: " + e.getMessage());
	        }

	        System.out.println("Haluatko lis�t� nelj�nnen henkil�n? (k/e)");
	        String vastaus = lukija.nextLine();
	        if (vastaus.equals("k")) {
	            try (BufferedWriter bw = new BufferedWriter(new FileWriter(tiedostonimi, true))) {
	                System.out.println("Sy�t� henkil�n nimi:");
	                String nimi = lukija.nextLine();
	                System.out.println("Sy�t� henkil�n ik�:");
	                int ika = Integer.parseInt(lukija.nextLine());
	                System.out.println("Sy�t� henkil�n s�hk�postiosoite:");
	                String email = lukija.nextLine();

	                // Tallenna tiedot tekstitiedostoon
	                bw.write(nimi + "," + ika + "," + email);
	                bw.newLine();

	                System.out.println("Henkil�n tiedot tallennettu tiedostoon " + tiedostonimi);
	            } catch (IOException e) {
	                System.out.println("Tiedoston tallennus ep�onnistui: " + e.getMessage());
	            }
	        }
	    }
	}


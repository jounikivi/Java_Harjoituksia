package kotitehtävät3;

import java.util.Random;
import java.util.Scanner;

public class KT5 {
	public static void main(String[] args) {
		 Scanner lukija = new Scanner(System.in);
	        Random arpuri = new Random();
	        String pelaajanValinta;
	        int tietokoneenValinta;
	        
	        System.out.println("Tervetuloa pelaamaan kivi-paperi-sakset-peliä!");
	        System.out.println("Valitse kivi, paperi tai sakset (kirjoita sana):");
	        pelaajanValinta = lukija.nextLine();
	        
	        // Arvotaan tietokoneen valinta
	        tietokoneenValinta = arpuri.nextInt(3);
	        
	        // Tulostetaan tietokoneen valinta
	        System.out.print("Tietokone valitsi ");
	        switch (tietokoneenValinta) {
	            case 0:
	                System.out.println("kiven.");
	                break;
	            case 1:
	                System.out.println("paperin.");
	                break;
	            case 2:
	                System.out.println("sakset.");
	                break;
	        }
	        
	        // Tarkistetaan voittaja
	        if (pelaajanValinta.equals("kivi")) {
	            if (tietokoneenValinta == 0) {
	                System.out.println("Tasapeli!");
	            } else if (tietokoneenValinta == 1) {
	                System.out.println("Tietokone voitti!");
	            } else {
	                System.out.println("Voitit!");
	            }
	        } else if (pelaajanValinta.equals("paperi")) {
	            if (tietokoneenValinta == 0) {
	                System.out.println("Voitit!");
	            } else if (tietokoneenValinta == 1) {
	                System.out.println("Tasapeli!");
	            } else {
	                System.out.println("Tietokone voitti!");
	            }
	        } else if (pelaajanValinta.equals("sakset")) {
	            if (tietokoneenValinta == 0) {
	                System.out.println("Tietokone voitti!");
	            } else if (tietokoneenValinta == 1) {
	                System.out.println("Voitit!");
	            } else {
	                System.out.println("Tasapeli!");
	            }
	        } else {
	            System.out.println("Virheellinen valinta!");
	        }
	}
}

package kotitehtävät7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KT8 {
	  	public static void main(String[] args) {
	        File tiedosto = new File("ankka.txt");

	        int sanojenMaara = 0;
	        String pisinSana = "";
	        int pisinSananPituus = 0;

	        try (Scanner lukija = new Scanner(tiedosto)) {
	            while (lukija.hasNext()) {
	                String sana = lukija.next();
	                sanojenMaara++;

	                if (sana.length() > pisinSananPituus) {
	                    pisinSana = sana;
	                    pisinSananPituus = sana.length();
	                }
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("Tiedostoa ei löytynyt: " + e.getMessage());
	            return;
	        }

	        System.out.println("Tiedostossa on " + sanojenMaara + " sanaa.");
	        System.out.println("Pisin sana on \"" + pisinSana + "\" ja sen pituus on " + pisinSananPituus + " merkkiä.");
	    }
	}



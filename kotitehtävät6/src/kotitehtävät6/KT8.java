package kotitehtävät6;

import java.util.Scanner;

public class KT8 {
	public static void kysyKokonaisluku() {
		Scanner lukija = new Scanner(System.in);
	    int luku = 0;
	    while (true) {
	        System.out.println("Anna kokonaisluku väliltä 1-6: ");
	        String syote = lukija.nextLine();
	        try {
	            luku = Integer.parseInt(syote);
	        } catch (NumberFormatException e) {
	            System.out.println("Virheellinen syöte. Anna kokonaisluku väliltä 1-6.");
	            continue;
	        }
	        if (luku < 1 || luku > 6) {
	            System.out.println("Virheellinen syöte. Anna kokonaisluku väliltä 1-6.");
	        } else {
	            break;
	        }
	    }
	    System.out.println("Annoit kokonaisluvun: " + luku);
	}

}


package kotitehtävät6;

import java.math.BigInteger;
import java.util.Scanner;

public class KT9 {
	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
	    System.out.println("Anna ensimmäinen luku: ");
	    String syote1 = lukija.nextLine();
	    System.out.println("Anna toinen luku: ");
	    String syote2 = lukija.nextLine();
	    BigInteger luku1 = new BigInteger(syote1);
	    BigInteger luku2 = new BigInteger(syote2);
	    BigInteger tulo = luku1.multiply(luku2);
	    if (tulo.compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE))) > 0) {
	        System.out.println("Tulosta ei saatu mahtumaan int-tyyppiseen muuttujaan.");
	    } else {
	        System.out.println("Lukujen tulo on: " + tulo.intValue());
	    }
	}

	}


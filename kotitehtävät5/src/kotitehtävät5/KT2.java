package kotiteht�v�t5;

import java.util.Scanner;

public class KT2 {
	 public static void main(String[] args) {
	        Scanner lukija = new Scanner(System.in);

	        System.out.print("Sy�t� ensimm�inen merkkijono: ");
	        String jono1 = lukija.nextLine();

	        System.out.print("Sy�t� toinen merkkijono: ");
	        String jono2 = lukija.nextLine();

	        tulostaPidempi(jono1, jono2);
	    }

	    public static void tulostaPidempi(String jono1, String jono2) {
	        if (jono1.length() >= jono2.length()) {
	            System.out.println(jono1);
	        } else {
	            System.out.println(jono2);
	        }
	    }
	}


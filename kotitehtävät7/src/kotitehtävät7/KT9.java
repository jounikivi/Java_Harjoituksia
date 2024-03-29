package kotitehtävät7;

import java.util.Scanner;

public class KT9 {
	public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä salasana:");

        String salasana = lukija.nextLine();
        boolean vahvaSalasana = true;

        // Tarkistetaan salasanan vahvuus
        if (salasana.length() < 8) {
            System.out.println("Salasana on liian lyhyt.");
            vahvaSalasana = false;
        }
        if (!salasana.matches(".*\\d.*")) {
            System.out.println("Salasanassa ei ole numeroita.");
            vahvaSalasana = false;
        }
        if (!salasana.matches(".*[A-Z].*")) {
            System.out.println("Salasanassa ei ole isoja kirjaimia.");
            vahvaSalasana = false;
        }
        if (!salasana.matches(".*[!@#$%^&*()-+].*")) {
            System.out.println("Salasanassa ei ole erikoismerkkejä.");
            vahvaSalasana = false;
        }

        if (vahvaSalasana) {
            System.out.println("Salasana on vahva!");
        } else {
            System.out.println("Salasana ei ole tarpeeksi vahva.");
        }
    }
}


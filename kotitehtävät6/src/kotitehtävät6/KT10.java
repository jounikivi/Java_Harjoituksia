package kotitehtävät6;

import java.util.Scanner;

public class KT10 {
	public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna taulukon pituus: ");
        int pituus = lukija.nextInt();
        lukija.nextLine(); 
        
        char[] merkkijono = new char[pituus];
        System.out.print("Anna lause: ");
        String lause = lukija.nextLine();
        
        for (int i = 0; i < pituus && i < lause.length(); i++) {
            merkkijono[i] = lause.charAt(i);
        }
        
        System.out.print("Taulukko: ");
        for (char c : merkkijono) {
            System.out.print(c);
        }
    }
}


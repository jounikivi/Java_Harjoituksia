package kotitehtävät5;

import java.util.Scanner;

public class KT4 {
	public static void ekatKirjaimet(String jono) {
		   String[] sanat = jono.split(" ");
		   for(int i = 0; i < sanat.length; i++) {
		      System.out.print(sanat[i].charAt(0));
		   }
		   System.out.println();
		}
	public static void main(String[] args) {
		   Scanner lukija = new Scanner(System.in);
		   System.out.print("Syötä merkkijono: ");
		   String jono = lukija.nextLine();
		   ekatKirjaimet(jono);
		}

}

package kotitehtävät5;

import java.util.Scanner;

public class KT7 {
	public static boolean onAnagrammit(String jono1, String jono2) {
		   jono1 = jono1.toLowerCase();
		   jono2 = jono2.toLowerCase();
		   if(jono1.length() != jono2.length()) {
		      return false;
		   }
		   int[] kirjaimet1 = new int[256];
		   int[] kirjaimet2 = new int[256];
		   for(int i = 0; i < jono1.length(); i++) {
		      kirjaimet1[(int)jono1.charAt(i)]++;
		      kirjaimet2[(int)jono2.charAt(i)]++;
		   }
		   for(int i = 0; i < 256; i++) {
		      if(kirjaimet1[i] != kirjaimet2[i]) {
		         return false;
		      }
		   }
		   return true;
		}

		public static void main(String[] args) {
		   Scanner lukija = new Scanner(System.in);
		   System.out.print("Syötä ensimmäinen merkkijono: ");
		   String jono1 = lukija.nextLine();
		   System.out.print("Syötä toinen merkkijono: ");
		   String jono2 = lukija.nextLine();
		   if(onAnagrammit(jono1, jono2)) {
		      System.out.println(jono1 + " ja " + jono2 + " ovat anagrammeja.");
		   } else {
		      System.out.println(jono1 + " ja " + jono2 + " eivät ole anagrammeja.");
		   }
		}

}

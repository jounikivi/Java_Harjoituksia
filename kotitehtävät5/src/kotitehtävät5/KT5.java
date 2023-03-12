package kotitehtävät5;

import java.util.Scanner;

public class KT5 {
	public static String takaperin(String jono) {
	      String reversed = "";
	      for(int i = jono.length() - 1; i >= 0; i--) {
	         reversed += jono.charAt(i);
	      }
	      return reversed;
	   }
	   
	   public static boolean onPalindromi(String jono) {
	      String reversed = takaperin(jono);
	      if(jono.equals(reversed)) {
	         return true;
	      } else {
	         return false;
	      }
	   }
	   
	   public static void main(String[] args) {
	      Scanner lukija = new Scanner(System.in);
	      System.out.print("Syötä merkkijono: ");
	      String jono = lukija.nextLine();
	      if(onPalindromi(jono)) {
	         System.out.println("Merkkijono " + jono + " on palindromi.");
	      } else {
	         System.out.println("Merkkijono " + jono + " ei ole palindromi.");
	      }
	   }
	}


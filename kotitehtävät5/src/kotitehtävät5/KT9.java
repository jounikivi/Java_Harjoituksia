package kotiteht�v�t5;

import java.util.Scanner;

public class KT9 {
	public static String kapitalisoi(String mjono) {
	    String[] sanat = mjono.split(" ");
	    StringBuilder sb = new StringBuilder();
	    for (String sana : sanat) {
	        if (sana.length() > 0) {
	            String ensimm�inenKirjain = sana.substring(0, 1);
	            String loputKirjaimet = sana.substring(1);
	            sb.append(ensimm�inenKirjain.toUpperCase() + loputKirjaimet + " ");
	        }
	    }
	    return sb.toString().trim();
	}
	public static void main(String[] args) {
	    Scanner lukija = new Scanner(System.in);
	    System.out.print("Sy�t� merkkijono: ");
	    String jono = lukija.nextLine();
	    String kapitalisoituJono = kapitalisoi(jono);
	    System.out.println("Merkkijono isolla alkukirjaimella: " + kapitalisoituJono);
	}

}

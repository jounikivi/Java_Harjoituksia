package kotiteht�v�t5;

import java.util.Scanner;

public class KT8 {
	public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Sy�t� merkkijono: ");
        String mjono = lukija.nextLine();

        String kapitalisoituMjono = kapitalisoi(mjono);

        System.out.println("Alkuper�inen merkkijono: " + mjono);
        System.out.println("Kapitalisoitu merkkijono: " + kapitalisoituMjono);
    }

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
}

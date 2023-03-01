package kotitehtävät4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class KT10 {
	public static void main(String[] args) {
        int[] pelaajanRivi = kysyLottorivi();
        int[] virallinenRivi = arvoLottorivi();
        System.out.println("Virallinen lottorivi: " + Arrays.toString(virallinenRivi));
        int oikein = tarkistaOsumat(pelaajanRivi, virallinenRivi);
        System.out.println("Sait " + oikein + " oikein!");
    }
    
    public static int[] kysyLottorivi() {
        Scanner lukija = new Scanner(System.in);
        int[] lottorivi = new int[7];
        System.out.println("Syötä lottorivi (7 numeroa väliltä 1-40):");
        for (int i = 0; i < 7; i++) {
            int numero = lukija.nextInt();
            if (numero < 1 || numero > 40 || sisaltaa(lottorivi, numero)) {
                System.out.println("Virheellinen numero! Syötä uusi numero:");
                i--;
            } else {
                lottorivi[i] = numero;
            }
        }
        Arrays.sort(lottorivi);
        return lottorivi;
    }
    
    public static int[] arvoLottorivi() {
        Random random = new Random();
        int[] lottorivi = new int[7];
        int i = 0;
        while (i < 7) {
            int numero = random.nextInt(40) + 1;
            if (!sisaltaa(lottorivi, numero)) {
                lottorivi[i] = numero;
                i++;
            }
        }
        Arrays.sort(lottorivi);
        return lottorivi;
    }
    
    public static boolean sisaltaa(int[] taulukko, int luku) {
        for (int i = 0; i < taulukko.length; i++) {
            if (taulukko[i] == luku) {
                return true;
            }
        }
        return false;
    }
    
    public static int tarkistaOsumat(int[] pelaajanRivi, int[] virallinenRivi) {
        int osumat = 0;
        for (int i = 0; i < pelaajanRivi.length; i++) {
            if (sisaltaa(virallinenRivi, pelaajanRivi[i])) {
                osumat++;
            }
        }
        return osumat;
    }
}

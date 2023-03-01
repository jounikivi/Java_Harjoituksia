package kotitehtävät4;

import java.util.Arrays;
import java.util.Random;

public class KT9 {
	public static void main(String[] args) {
        int[] lottorivi = arvoLottorivi();
        Arrays.sort(lottorivi);
        System.out.println("Lottonumerot:");
        for (int numero : lottorivi) {
            System.out.print(numero + " ");
        }
    }

    public static int[] arvoLottorivi() {
        int[] lottorivi = new int[7];
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            int numero;
            do {
                numero = random.nextInt(40) + 1;
            } while (sisaltaa(lottorivi, numero));
            lottorivi[i] = numero;
        }
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
}


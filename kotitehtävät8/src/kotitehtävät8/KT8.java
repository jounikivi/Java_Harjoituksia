package kotitehtävät8;

import java.util.Scanner;

public class KT8 {

    public static void main(String[] args) {
        testaaKertotaulu();
    }

    public static void testaaKertotaulu() {
        Scanner lukija = new Scanner(System.in);
        int oikeatVastaukset = 0;

        System.out.println("Tervetuloa kertotaulutestiin! Vastaa kysymyksiin kymmenen kertotaulusta.");

        for (int i = 1; i <= 10; i++) {
            int luku1 = (int) (Math.random() * 10) + 1;
            int luku2 = 10;
            int tulos = luku1 * luku2;

            System.out.print(i + ". Kysymys: " + luku1 + " x " + luku2 + " = ");
            int vastaus = lukija.nextInt();

            if (vastaus == tulos) {
                System.out.println("Oikein!");
                oikeatVastaukset++;
            } else {
                System.out.println("Väärin. Oikea vastaus oli " + tulos + ".");
            }
        }

        System.out.println("Testi on päättynyt. Saavutit " + oikeatVastaukset + " pistettä kymmenestä.");
    }
}


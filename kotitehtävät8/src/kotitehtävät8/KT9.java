package kotiteht‰v‰t8;

import java.util.Scanner;

public class KT9 {

    public static void main(String[] args) {
        testaaKertotaulu();
    }

    public static void testaaKertotaulu() {
        Scanner lukija = new Scanner(System.in);
        int oikeatVastaukset = 0;
        String jatka = "kyll‰";

        System.out.println("Tervetuloa kertotaulutestiin! Vastaa kysymyksiin kymmenen kertotaulusta.");

        while (jatka.equalsIgnoreCase("kyll‰")) {
            int luku1 = (int) (Math.random() * 10) + 1;
            int luku2 = 10;
            int tulos = luku1 * luku2;

            System.out.print("Kysymys: " + luku1 + " x " + luku2 + " = ");
            int vastaus = lukija.nextInt();

            if (vastaus == tulos) {
                System.out.println("Oikein!");
                oikeatVastaukset++;
            } else {
                System.out.println("V‰‰rin. Oikea vastaus oli " + tulos + ".");
            }

            System.out.print("Haluatko jatkaa? (kyll‰/ei): ");
            jatka = lukija.next();
        }

        System.out.println("Testi on p‰‰ttynyt. Saavutit " + oikeatVastaukset + " pistett‰.");
    }
}


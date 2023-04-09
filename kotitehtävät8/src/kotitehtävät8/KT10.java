package kotiteht‰v‰t8;

import java.util.Scanner;

public class KT10 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Kysyt‰‰n k‰ytt‰j‰lt‰ kertojan ja kerrottavan rajat
        System.out.print("Anna kertojan alaraja: ");
        int kertojanAlaraja = lukija.nextInt();
        System.out.print("Anna kertojan yl‰raja: ");
        int kertojanYl‰raja = lukija.nextInt();
        System.out.print("Anna kerrottavan alaraja: ");
        int kerrottavanAlaraja = lukija.nextInt();
        System.out.print("Anna kerrottavan yl‰raja: ");
        int kerrottavanYl‰raja = lukija.nextInt();

        // Muuttujat oikeiden vastausten ja kysymysten m‰‰r‰n seurantaan
        int oikeatVastaukset = 0;
        int kysymystenMaara = 0;

        // Tulostetaan ohje k‰ytt‰j‰lle
        System.out.println("Tervetuloa kertolaskutestiin! Vastaa kysymyksiin kertojilla " + kertojanAlaraja + "-" + kertojanYl‰raja
                + " ja kerrottavilla " + kerrottavanAlaraja + "-" + kerrottavanYl‰raja + ".");

        // Suoritetaan 10 kertolaskua k‰ytt‰j‰n m‰‰rittelemill‰ rajoilla
        for (int i = 1; i <= 10; i++) {
            // Luodaan satunnaiset kertoja ja kerrottava k‰ytt‰j‰n m‰‰rittelemien rajojen sis‰ll‰
            int luku1 = (int) (Math.random() * (kertojanYl‰raja - kertojanAlaraja + 1)) + kertojanAlaraja;
            int luku2 = (int) (Math.random() * (kerrottavanYl‰raja - kerrottavanAlaraja + 1)) + kerrottavanAlaraja;
            int tulos = luku1 * luku2;

            // Tulostetaan kysymys k‰ytt‰j‰lle ja pyydet‰‰n vastausta
            System.out.print("Kysymys " + i + ": " + luku1 + " x " + luku2 + " = ");
            int vastaus = lukija.nextInt();
            kysymystenMaara++;

            // Tarkistetaan vastaus ja p‰ivitet‰‰n oikeiden vastausten m‰‰r‰
            if (vastaus == tulos) {
                System.out.println("Oikein!");
                oikeatVastaukset++;
            } else {
                System.out.println("V‰‰rin. Oikea vastaus oli " + tulos + ".");
            }
        }

        // Tulostetaan lopputulokset k‰ytt‰j‰lle
        System.out.println("Testi on p‰‰ttynyt. Saavutit " + oikeatVastaukset + " pistett‰ " + kysymystenMaara + " kysymyksest‰.");
    }
}


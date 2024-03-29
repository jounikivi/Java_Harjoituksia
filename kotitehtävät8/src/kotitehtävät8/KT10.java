package kotitehtävät8;

import java.util.Scanner;

public class KT10 {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Kysytään käyttäjältä kertojan ja kerrottavan rajat
        System.out.print("Anna kertojan alaraja: ");
        int kertojanAlaraja = lukija.nextInt();
        System.out.print("Anna kertojan yläraja: ");
        int kertojanYläraja = lukija.nextInt();
        System.out.print("Anna kerrottavan alaraja: ");
        int kerrottavanAlaraja = lukija.nextInt();
        System.out.print("Anna kerrottavan yläraja: ");
        int kerrottavanYläraja = lukija.nextInt();

        // Muuttujat oikeiden vastausten ja kysymysten määrän seurantaan
        int oikeatVastaukset = 0;
        int kysymystenMaara = 0;

        // Tulostetaan ohje käyttäjälle
        System.out.println("Tervetuloa kertolaskutestiin! Vastaa kysymyksiin kertojilla " + kertojanAlaraja + "-" + kertojanYläraja
                + " ja kerrottavilla " + kerrottavanAlaraja + "-" + kerrottavanYläraja + ".");

        // Suoritetaan 10 kertolaskua käyttäjän määrittelemillä rajoilla
        for (int i = 1; i <= 10; i++) {
            // Luodaan satunnaiset kertoja ja kerrottava käyttäjän määrittelemien rajojen sisällä
            int luku1 = (int) (Math.random() * (kertojanYläraja - kertojanAlaraja + 1)) + kertojanAlaraja;
            int luku2 = (int) (Math.random() * (kerrottavanYläraja - kerrottavanAlaraja + 1)) + kerrottavanAlaraja;
            int tulos = luku1 * luku2;

            // Tulostetaan kysymys käyttäjälle ja pyydetään vastausta
            System.out.print("Kysymys " + i + ": " + luku1 + " x " + luku2 + " = ");
            int vastaus = lukija.nextInt();
            kysymystenMaara++;

            // Tarkistetaan vastaus ja päivitetään oikeiden vastausten määrä
            if (vastaus == tulos) {
                System.out.println("Oikein!");
                oikeatVastaukset++;
            } else {
                System.out.println("Väärin. Oikea vastaus oli " + tulos + ".");
            }
        }

        // Tulostetaan lopputulokset käyttäjälle
        System.out.println("Testi on päättynyt. Saavutit " + oikeatVastaukset + " pistettä " + kysymystenMaara + " kysymyksestä.");
    }
}


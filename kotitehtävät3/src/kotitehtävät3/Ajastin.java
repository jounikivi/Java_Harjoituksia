package kotitehtävät3;

import java.util.Scanner;

public class Ajastin {
    private int minuutit;
    private int sekunnit;

    // Konstruktori, joka asettaa ajastimen ajan
    public Ajastin(int minuutit, int sekunnit) {
        asetaAika(minuutit, sekunnit);
    }

    // Metodi, jolla asetetaan ajastimen aika
    public void asetaAika(int minuutit, int sekunnit) {
        // Tarkistetaan, ettei aika ole negatiivinen
        if (minuutit < 0) {
            minuutit = 0;
        }
        if (sekunnit < 0) {
            sekunnit = 0;
        }
        // Tarkistetaan, ettei aika ylitä viittä minuuttia
        if (minuutit > 5) {
            minuutit = 5;
            sekunnit = 0;
        }
        // Muunnetaan ylimääräiset sekunnit minuuteiksi
        if (sekunnit >= 60) {
            minuutit += sekunnit / 60;
            sekunnit %= 60;
        }
        // Asetetaan ajastimen aika
        this.minuutit = minuutit;
        this.sekunnit = sekunnit;
    }

    // Metodi, joka palauttaa ajastimen minuutit
    public int getMinuutit() {
        return minuutit;
    }

    // Metodi, joka palauttaa ajastimen sekunnit
    public int getSekunnit() {
        return sekunnit;
    }

    // Metodi, joka tulostaa ajastimen ajan muodossa mm:ss
    public void tulosta() {
        System.out.printf("%d:%02d\n", minuutit, sekunnit);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Pyydetään käyttäjältä minuutit ja sekunnit
        System.out.print("Syötä minuutit: ");
        int minuutit = lukija.nextInt();
        System.out.print("Syötä sekunnit: ");
        int sekunnit = lukija.nextInt();

        // Luodaan ajastin käyttäjän syöttämällä ajalla
        Ajastin ajastin = new Ajastin(minuutit, sekunnit);

        // Tarkistetaan joka sekunti, onko aika kulunut loppuun
        while (ajastin.getMinuutit() > 0 || ajastin.getSekunnit() > 0) {
            ajastin.tulosta();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Vähennetään yksi sekunti ajasta
            ajastin.asetaAika(ajastin.getMinuutit(), ajastin.getSekunnit() - 1);
        }

        // Ilmoitetaan, kun aika on kulunut loppuun
        System.out.println("Aika loppui!");
    }
}


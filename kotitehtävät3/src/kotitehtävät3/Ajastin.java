package kotitehtävät3;

import java.util.Scanner;

public class Ajastin {
    private int minuutit;
    private int sekunnit;

    public Ajastin(int min, int sek) {
        setAika(min, sek);
    }

    public void setAika(int min, int sek) {
        // Jos sekuntimäärä on minuutti tai enemmän, lisätään ylimenevät sekunnit minuutteihin
        if (sek >= 60) {
            min += sek / 60;
            sek %= 60;
        }
        // Jos arvo on negatiivinen, tulee arvoksi nolla
        if (min < 0 || sek < 0) {
            min = 0;
            sek = 0;
        }
        // Ajastimen maksimiaika on 5 min, jos aika täyttyy, tulee arvoksi nolla
        if (min > 5 || (min == 5 && sek > 0)) {
            min = 5;
            sek = 0;
        }
        this.minuutit = min;
        this.sekunnit = sek;
    }

    public int getMinuutit() {
        return this.minuutit;
    }

    public int getSekunnit() {
        return this.sekunnit;
    }

    public void tulosta() {
        System.out.printf("%d:%02d\n", this.minuutit, this.sekunnit);
    }

    public void lisaaMinuutti() {
        setAika(this.minuutit + 1, this.sekunnit);
    }

    public void vahennaSekunti() {
        setAika(this.minuutit, this.sekunnit - 1);
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syötä minuutit: ");
        int min = lukija.nextInt();
        System.out.print("Syötä sekunnit: ");
        int sek = lukija.nextInt();
        Ajastin ajastin = new Ajastin(min, sek);

        ajastin.tulosta();
        ajastin.lisaaMinuutti();
        ajastin.tulosta();
        ajastin.vahennaSekunti();
        ajastin.tulosta();
    }
}



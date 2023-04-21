package KT10;

import java.util.Scanner;

public class Pituusmuunnin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna pituus senttimetreinä: ");
        double pituusCm = lukija.nextDouble();
        double[] jalatTuumat = cmJalkatuumat(pituusCm);
        double jalkoja = jalatTuumat[0];
        double tuumia = jalatTuumat[1];
        System.out.println(pituusCm + " cm = " + jalkoja + " ft " + tuumia + " in");
        double sentteina = jalkatuumatCm(jalkoja, tuumia);
        System.out.println(jalkoja + " ft " + tuumia + " in = " + sentteina + " cm");
    }

    /**
     * Muuntaa senttimetrit jalkoiksi ja tuumiksi.
     * @param cm Pituus senttimetreinä.
     * @return Taulukko, jossa ensimmäinen alkio on jalkojen määrä ja toinen tuumien määrä.
     */
    public static double[] cmJalkatuumat(double cm) {
        double[] tulos = new double[2];
        double jalkoja = cm / 30.48;
        double kokonaisiaJalkoja = Math.floor(jalkoja);
        double tuumia = (jalkoja - kokonaisiaJalkoja) * 12;
        tulos[0] = kokonaisiaJalkoja;
        tulos[1] = tuumia;
        return tulos;
    }

    /**
     * Muuntaa jalkojen ja tuumien määrän senttimetreiksi.
     * @param ft Jalkojen määrä.
     * @param in Tuumien määrä.
     * @return Pituus senttimetreinä.
     */
    public static double jalkatuumatCm(double ft, double in) {
        double cm = ft * 30.48 + in * 2.54;
        return cm;
    }
}


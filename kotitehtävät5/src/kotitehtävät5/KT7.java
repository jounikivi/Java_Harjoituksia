package kotiteht‰v‰t5;

import java.util.Scanner;

public class KT7 {
    // metodi tarkistaa ovatko annetut jonot anagrammeja
    public static boolean onAnagrammit(String jono1, String jono2) {
        // muutetaan molemmat jonot pieniksi kirjaimiksi, jotta isot ja pienet kirjaimet k‰sitell‰‰n samana
        jono1 = jono1.toLowerCase();
        jono2 = jono2.toLowerCase();
        
        // jos jonot eiv‰t ole saman pituiset, ne eiv‰t voi olla anagrammeja
        if(jono1.length() != jono2.length()) {
            return false;
        }
        
        // taulukot, jotka laskettavat kuinka monta kertaa kullakin merkill‰ esiintyy
        int[] kirjaimet1 = new int[256];
        int[] kirjaimet2 = new int[256];
        
        // k‰yd‰‰n l‰pi molemmat jonot merkki kerrallaan ja lis‰t‰‰n merkin esiintymiskerta taulukkoon
        for(int i = 0; i < jono1.length(); i++) {
            kirjaimet1[(int)jono1.charAt(i)]++;
            kirjaimet2[(int)jono2.charAt(i)]++;
        }
        
        // k‰yd‰‰n l‰pi taulukot ja tarkistetaan, ett‰ jokainen merkki esiintyy saman verran molemmissa jonoissa
        for(int i = 0; i < 256; i++) {
            if(kirjaimet1[i] != kirjaimet2[i]) {
                return false;
            }
        }
        
        // jos kaikki merkit esiintyv‰t samoissa m‰‰riss‰ molemmissa jonoissa, ne ovat anagrammeja
        return true;
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syˆt‰ ensimm‰inen merkkijono: ");
        String jono1 = lukija.nextLine();
        System.out.print("Syˆt‰ toinen merkkijono: ");
        String jono2 = lukija.nextLine();
        
        // kutsutaan onAnagrammit-metodia ja tulostetaan tulos
        if(onAnagrammit(jono1, jono2)) {
            System.out.println(jono1 + " ja " + jono2 + " ovat anagrammeja.");
        } else {
            System.out.println(jono1 + " ja " + jono2 + " eiv‰t ole anagrammeja.");
        }
    }
}


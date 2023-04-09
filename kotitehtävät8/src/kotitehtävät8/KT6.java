package kotitehtävät8;

import java.util.*;

public class KT6
{
  public static void main(String[] args) {
    String[][] maatJaPkaupungit = {
      {"Suomi", "Helsinki"},
      {"Ruotsi", "Tukholma"},
      {"Norja", "Oslo"},
      {"Tanska", "Kööpenhamina"},
      {"Venäjä", "Moskova"},
      {"Yhdysvallat", "Washington, D.C."},
      {"Iso-Britannia", "Lontoo"},
      {"Ranska", "Pariisi"},
      {"Saksa", "Berliini"},
      {"Italia", "Rooma"}
    };
    
    int oikeatVastaukset = 0;
    Scanner lukija = new Scanner(System.in);
    Random random = new Random();
    
    System.out.println("Tervetuloa maapaakaupunkipeliin!");
    
    for (int i = 0; i < 5; i++) {
      int maaIndeksi = random.nextInt(maatJaPkaupungit.length);
      String maa = maatJaPkaupungit[maaIndeksi][0];
      String oikeaVastaus = maatJaPkaupungit[maaIndeksi][1];
      
      System.out.println("Mikä on maan " + maa + " pääkaupunki?");
      String vastaus = lukija.nextLine();
      
      if (vastaus.equalsIgnoreCase(oikeaVastaus)) {
        System.out.println("Oikein!");
        oikeatVastaukset++;
      } else {
        System.out.println("Väärin! Oikea vastaus oli " + oikeaVastaus);
      }
    }
    
    System.out.println("Peli on päättynyt. Saavutit " + oikeatVastaukset + "/5 pistettä.");
  }
}


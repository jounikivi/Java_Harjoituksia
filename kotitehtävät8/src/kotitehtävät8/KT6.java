package kotiteht�v�t8;

import java.util.*;

public class KT6
{
  public static void main(String[] args) {
    String[][] maatJaPkaupungit = {
      {"Suomi", "Helsinki"},
      {"Ruotsi", "Tukholma"},
      {"Norja", "Oslo"},
      {"Tanska", "K��penhamina"},
      {"Ven�j�", "Moskova"},
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
      
      System.out.println("Mik� on maan " + maa + " p��kaupunki?");
      String vastaus = lukija.nextLine();
      
      if (vastaus.equalsIgnoreCase(oikeaVastaus)) {
        System.out.println("Oikein!");
        oikeatVastaukset++;
      } else {
        System.out.println("V��rin! Oikea vastaus oli " + oikeaVastaus);
      }
    }
    
    System.out.println("Peli on p��ttynyt. Saavutit " + oikeatVastaukset + "/5 pistett�.");
  }
}


package kotitehtävät8;

import java.io.*;
import java.util.*;

public class KT7 {
  public static void main(String[] args) {
    String[][] maatJaPkaupungit = lueTiedosto("maat.txt");
    
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
  
  public static String[][] lueTiedosto(String tiedostonNimi) {
    List<String[]> lista = new ArrayList<>();
    try (BufferedReader lukija = new BufferedReader(new FileReader(tiedostonNimi))) {
      String rivi;
      while ((rivi = lukija.readLine()) != null) {
        String[] tiedot = rivi.split(",");
        lista.add(tiedot);
      }
    } catch (IOException e) {
      System.err.println("Virhe tiedoston lukemisessa: " + e.getMessage());
      System.exit(1);
    }
    
    String[][] taulukko = new String[lista.size()][2];
    for (int i = 0; i < lista.size(); i++) {
      taulukko[i] = lista.get(i);
    }
    return taulukko;
  }
}


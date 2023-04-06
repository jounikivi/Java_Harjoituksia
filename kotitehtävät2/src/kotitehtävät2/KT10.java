package kotitehtävät2;

import java.util.Scanner;

public class KT10 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Kysytään käyttäjältä Fibonaccin luvun indeksi, jota halutaan laskea
    System.out.print("Syötä kokonaisluku: ");
    int n = scan.nextInt();
    scan.close();

    // Alustetaan ensimmäiset kaksi Fibonaccin lukua
    int a = 0, b = 1;

    // Tulostetaan ensimmäiset kaksi lukua
    System.out.print("Fibonaccin lukujono: " + a + " " + b);

    // Silmukka, joka laskee ja tulostaa Fibonaccin luvut
    for (int i = 2; i < n; i++) {
      // Lasketaan seuraava Fibonaccin luku summaamalla kaksi edellistä lukua
      int c = a + b;

      // Tulostetaan laskettu luku
      System.out.print(" " + c);

      // Siirretään edelliset kaksi lukua eteenpäin
      a = b;
      b = c;
    }
  }
}


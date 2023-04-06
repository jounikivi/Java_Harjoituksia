package kotiteht�v�t2;

import java.util.Scanner;

public class KT10 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Kysyt��n k�ytt�j�lt� Fibonaccin luvun indeksi, jota halutaan laskea
    System.out.print("Sy�t� kokonaisluku: ");
    int n = scan.nextInt();
    scan.close();

    // Alustetaan ensimm�iset kaksi Fibonaccin lukua
    int a = 0, b = 1;

    // Tulostetaan ensimm�iset kaksi lukua
    System.out.print("Fibonaccin lukujono: " + a + " " + b);

    // Silmukka, joka laskee ja tulostaa Fibonaccin luvut
    for (int i = 2; i < n; i++) {
      // Lasketaan seuraava Fibonaccin luku summaamalla kaksi edellist� lukua
      int c = a + b;

      // Tulostetaan laskettu luku
      System.out.print(" " + c);

      // Siirret��n edelliset kaksi lukua eteenp�in
      a = b;
      b = c;
    }
  }
}


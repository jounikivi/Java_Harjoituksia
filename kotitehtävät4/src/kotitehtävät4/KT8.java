package kotiteht�v�t4;

import java.util.Arrays;
import java.util.Scanner;

public class KT8 {
	public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int[] luvut = new int[20];
        int lukujaSyotetty = 0;

        while (lukujaSyotetty < 20) {
            System.out.print("Sy�t� luku (-1 lopettaa): ");
            int luku = lukija.nextInt();
            if (luku == -1) {
                break;
            }
            luvut[lukujaSyotetty] = luku;
            lukujaSyotetty++;
        }
        Arrays.sort(luvut);
        System.out.println("Sy�tetyt luvut pienimm�st� suurimpaan:");
        for (int i = 0; i < lukujaSyotetty; i++) {
            System.out.println(luvut[i]);
        }
    }
}

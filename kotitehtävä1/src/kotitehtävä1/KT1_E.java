package kotitehtävä1;

import java.util.Scanner;

public class KT1_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        while (true) {
            System.out.print("Anna luku (-1 lopettaa): ");
            a = sc.nextInt();
            if (a == -1) {
                break;
            }
            if (a % 2 != 0) {
                System.out.println(a + " on pariton luku");
            } else {
                System.out.println(a + " on parillinen luku");
            }
        }
    }
}
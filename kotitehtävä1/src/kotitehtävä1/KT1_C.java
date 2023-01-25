package kotitehtävät;

import java.util.Scanner;

public class KT1_C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Anna luku: ");
        int a = sc.nextInt();
        if (a > 0 && a < 15) {
            System.out.println(a + " on välillä 0 ja 15");
        } else {
            System.out.println(a + " ei ole välillä 0 ja 15");
        }
    
	}

}

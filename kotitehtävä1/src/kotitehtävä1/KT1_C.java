package kotitehtävä1;

import java.util.Scanner;

public class KT1_C {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Anna jokin luku");
		int a = s.nextInt();
		if (a > 0 && a < 15 ) {
			System.out.println(a + " On välillä 0 ja 15");
		}
		else {
		}
	}
}

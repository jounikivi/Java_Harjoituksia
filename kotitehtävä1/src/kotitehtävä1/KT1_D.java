package kotitehtävä1;

import java.util.Scanner;

public class KT1_D {
	public static void main(String[] args) {
		System.out.println("Anna eka luku");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.print("Anna toinen luku: ");
		int b = s.nextInt();
		if (a > 0 && a < 15 && b > 0 && b < 14) {
			System.out.println("Mollemmat luvut eivät ole välillä 0 ja 15");
		}
		else {
			System.out.println("Eivät ole välillä 0 ja 15 ");
		}
		
	}
}

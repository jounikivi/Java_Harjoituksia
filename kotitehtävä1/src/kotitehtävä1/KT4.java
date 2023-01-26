package kotitehtävä1;

import java.util.Scanner;

public class KT4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Anna eka luku");
		int num1 = s.nextInt();
		
		System.out.println("Anna toka luku");
		int num2 = s.nextInt();
		
		System.out.println("Anna kolmas");
		int num3 = s.nextInt();
		
		int min = Math.min(Math.min(num1, num2), num3);
		int max = Math.max(Math.max(num1, num2), num3);
		
		int mid = num1 + num2 + num3 - min - max;
		
		System.out.println("Luvut pienimmästä suurimpaan: " + min + " " + mid + " " + max);
		
		
	}
}

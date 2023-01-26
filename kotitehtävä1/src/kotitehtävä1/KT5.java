package kotitehtävä1;

import java.util.Scanner;

public class KT5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Anna eka luku");
		int num1 = s.nextInt();
		
		System.out.println("Anna toka luku");
		int num2 = s.nextInt();
		
		System.out.println("Anna kolmas luku");
		int num3 = s.nextInt();
		
		System.out.print("Anna neljäs luku: ");
        int num4 = s.nextInt();

        int min = Math.min(Math.min(Math.min(num1, num2), num3), num4);
        int max = Math.max(Math.max(Math.max(num1, num2), num3), num4);

        int mid1 = num1 + num2 + num3 + num4 - min - max;

        int mid2 = num1 + num2 + num3 + num4 - min - max - mid1;

        System.out.println("Luvut pienimmästä suurimpaan: " + min + " " + mid1 + " " + mid2 + " " + max);
    }
}


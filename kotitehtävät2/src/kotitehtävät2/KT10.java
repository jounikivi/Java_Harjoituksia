package kotitehtävät2;

import java.util.Scanner;

public class KT10 {
	 public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    System.out.print("Enter an integer: ");
		    int n = scan.nextInt();
		    scan.close();

		    int a = 0, b = 1, c = 0;
		    System.out.print("Fibonacci series: " + a + " " + b);
		    for (int i = 2; i < n; i++) {
		      c = a + b;
		      System.out.print(" " + c);
		      a = b;
		      b = c;
		    }
		  }
		}


package kotiteht�v�t2;

import java.util.Random;

public class KT8 {
	 public static void main(String[] args) {
		    Random rand = new Random();
		    int count = 0;
		    int sum = 0;
		    int evenCount = 0;
		    int oddCount = 0;

		    int number;
		    do {
		      number = rand.nextInt(100) + 1;
		      count++;
		      sum += number;
		      if (number % 2 == 0) {
		        evenCount++;
		      } else {
		        oddCount++;
		      }
		    } while (number > 9 || number < 1);

		    double avg = (double) sum / count;

		    System.out.println("Arvottujen lukujen m��r�: " + count);
		    System.out.println("Arvottujen lukujen summa: " + sum);
		    System.out.println("Arvottujen lukujen keskiarvo: " + avg);

		    if (number % 2 == 0) {
		      System.out.println("Arvottujen parillisten lukujen m��r�: " + evenCount);
		    } else {
		      System.out.println("Arvottujen parittomien lukujen m��r�: " + oddCount);
		    }
		  }
		}


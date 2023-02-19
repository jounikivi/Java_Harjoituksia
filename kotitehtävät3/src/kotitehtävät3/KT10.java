package kotitehtävät3;

import java.util.Scanner;

public class KT10 {
	 private int minuutit;
	    private int sekunnit;

	    public KT10(int minuutit, int sekunnit) {
	        this.minuutit = minuutit;
	        this.sekunnit = sekunnit;
	    }

	    public int getMinuutit() {
	        return minuutit;
	    }

	    public int getSekunnit() {
	        return sekunnit;
	    }

	    public void tulosta() {
	        System.out.printf("%d:%02d\n", minuutit, sekunnit);
	    }

	    public void lisaaMinuutti() {
	        minuutit++;
	        if (minuutit > 5) {
	            minuutit = 5;
	        }
	    }

	    public void vahennaSekunti() {
	        sekunnit--;
	        if (sekunnit < 0) {
	            sekunnit = 59;
	            minuutit--;
	            if (minuutit < 0) {
	                minuutit = 0;
	                sekunnit = 0;
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner lukija = new Scanner(System.in);
	        System.out.print("Anna minuutit: ");
	        int minuutit = lukija.nextInt();
	        System.out.print("Anna sekunnit: ");
	        int sekunnit = lukija.nextInt();
	        KT8 ajastin = new KT8(minuutit, sekunnit);

	        System.out.println("Ajastin käy...");
	        while (ajastin.getMinuutit() > 0 || ajastin.getSekunnit() > 0) {
	            ajastin.tulosta();
	            ajastin.vahennaSekunti();
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        ajastin.tulosta();
	        System.out.println("Aika kului loppuun");
	    }
	}


package kotitehtävät3;

import java.util.Scanner;

public class KT8 {
	private int minuutit;
	private int sekunnit;

	public KT8(int minuutit, int sekunnit) {
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

	public void laskeAikaa(int sekuntia) {
		if (sekuntia < 0) {
			sekuntia = 0;
		}
		int uudetSekunnit = sekunnit + sekuntia;
		int ylimenevatMinuutit = uudetSekunnit / 60;
		int uudetMinuutit = minuutit + ylimenevatMinuutit;
		if (uudetMinuutit > 5) {
			uudetMinuutit = 5;
			uudetSekunnit = 0;
		} else {
			uudetSekunnit = uudetSekunnit % 60;
		}
		minuutit = uudetMinuutit;
		sekunnit = uudetSekunnit;
	}

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);
		System.out.print("Anna minuutit: ");
		int minuutit = lukija.nextInt();
		System.out.print("Anna sekunnit: ");
		int sekunnit = lukija.nextInt();
		KT8 ajastin = new KT8(minuutit, sekunnit);

		while (ajastin.getMinuutit() > 0 || ajastin.getSekunnit() > 0) {
			ajastin.tulosta();
			ajastin.laskeAikaa(1);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		ajastin.tulosta();
		System.out.println("Aika loppui!");
	}

	public void vahennaSekunti() {
		// TODO Auto-generated method stub
		
	}
}

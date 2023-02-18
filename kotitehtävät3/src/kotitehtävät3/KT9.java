package kotitehtävät3;

import java.util.Scanner;

public class KT9 {
	private int minuutit;
	private int sekunnit;

	public KT9(int minuutit, int sekunnit) {
		this.minuutit = minuutit;
		this.sekunnit = sekunnit;

		if (this.sekunnit >= 60) {
			this.minuutit += this.sekunnit / 60;
			this.sekunnit %= 60;
		}
		if (this.minuutit > 5) {
			this.minuutit = 5;
			this.sekunnit = 0;
		}
		if (this.minuutit < 0) {
			this.minuutit = 0;
			this.sekunnit = 0;
		}
	}

	public int getMinuutit() {
		return this.minuutit;
	}

	public int getSekunnit() {
		return this.sekunnit;
	}

	public void tulosta() {
		System.out.printf("%d:%02d\n", this.minuutit, this.sekunnit);
	}

	public void lisaaMinuutti() {
		this.minuutit++;
		if (this.minuutit > 5) {
			this.minuutit = 5;
			this.sekunnit = 0;
		}
	}

	public void vahennaSekunti() {
		this.sekunnit--;
		if (this.sekunnit < 0) {
			this.sekunnit = 59;
			this.minuutit--;
			if (this.minuutit < 0) {
				this.minuutit = 0;
				this.sekunnit = 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner lukija = new Scanner(System.in);

		System.out.print("Anna minuutit: ");
		int minuutit = lukija.nextInt();
		System.out.print("Anna sekunnit: ");
		int sekunnit = lukija.nextInt();

		KT9 ajastin = new KT9(minuutit, sekunnit);
		ajastin.tulosta();

		while (ajastin.getMinuutit() > 0 || ajastin.getSekunnit() > 0) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ajastin.vahennaSekunti();
			ajastin.tulosta();
		}
	}
}


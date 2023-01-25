package kotiteht‰v‰1;

public class KT1_I {
	public static void main(String[] args) {
		int a = 4;
		int b = 4;
		
		if(a == b && (a % b) % 2 == 0 && a != 0 && b !=0) {
			System.out.println("A ja B ovat yht‰ suuria ja osam‰‰r‰ a jaettuna b:ll‰ on jaollinen kahdella eik‰ kumpikaan \nluvuista ole nolla");
		}
		else {
			System.out.println("a tai b ei t‰yt‰ ehtoja");
		}
	}
}

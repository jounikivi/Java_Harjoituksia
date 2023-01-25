package kotitehtävä1;

public class KT1_F {
	public static void main(String[] args) {
		int a = 33;
		int b = 13;
		int tulos = a * b;
		
		if(tulos > 0) {
			System.out.println(a + " * " + b + " = " + tulos + " on positiivinen");
		}
		else {
			System.out.println(a + " * " + b + " = " + tulos + " ei positiivinen");
		}
	}
}

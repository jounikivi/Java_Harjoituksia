package kotiteht�v�t2;

public class KT3 {
	 public static void main(String[] args) {
		    int current = 2;
		    System.out.println("15 ensimm�ist� arvoa:");
		    for (int i = 1; i <= 15; i++) {
		      System.out.print(current + " ");
		      current = 2;
		    }
		    System.out.println();

		    current = 2;
		    System.out.println("Arvot, jotka ovat pienempi� kuin 10000:");
		    while (current < 10000) {
		      System.out.print(current + " ");
		      current= 2;
		    }
	 }
}


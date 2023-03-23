package kotitehtävät6;

public class KT7 {
	public static void main(String[] args) {
        String mjono = "Ankka nimeltä Anselmi aloittelee uintia lammella.";
        muokkaa_A_alkuiset(mjono);
    }
    
    public static void muokkaa_A_alkuiset(String mjono) {
        int starsCount = 1;
        String[] sanat = mjono.split(" ");
        for (int i = 0; i < sanat.length; i++) {
            String sana = sanat[i];
            if (sana.toLowerCase().startsWith("a")) {
                for (int j = 0; j < starsCount; j++) {
                    System.out.print("*");
                }
                starsCount++;
            } else {
                System.out.print(sana);
            }
            System.out.print(" ");
        }
    }
    
}
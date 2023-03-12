package kotiteht‰v‰t5;

public class KT10 {
	public static void tulostaVokaalialkuiset(String mjono) {
	    String[] sanat = mjono.split(" ");
	    for (String sana : sanat) {
	        char ensimm‰inenKirjain = sana.toLowerCase().charAt(0);
	        if (ensimm‰inenKirjain == 'a' || ensimm‰inenKirjain == 'e' || 
	            ensimm‰inenKirjain == 'i' || ensimm‰inenKirjain == 'o' || 
	            ensimm‰inenKirjain == 'u' || ensimm‰inenKirjain == 'y') {
	            System.out.println(sana);
	        }
	    }
	}
	public static void main(String[] args) {
	    String mjono = "Aamu alkoi aurinkoisena, mutta iltaan menness‰ s‰‰ viileni.";
	    tulostaVokaalialkuiset(mjono);
	}

}

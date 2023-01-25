package kotitehtävä1;

public class Kt1_H {
	public static void main(String[] args) {
		int a = 0;
		int b = 6;
		if((a == 0 || b == 6) && !(a == 0 && b == 6)) {
		    System.out.println("A on nolla tai b on kuusi, mutta ei molemmat");
		}
		else {
			System.out.println("A ei ole nolla tai b ei ole kuusi tai molemmat ovat nolla tai kuusi");
		}
	}
}

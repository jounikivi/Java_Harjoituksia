package kotitehtävät10;

public class Summa {
    public static void main(String[] args) {
        int luku1 = Integer.parseInt(args[0]);
        int luku2 = Integer.parseInt(args[1]);
        int summa = luku1 + luku2;
        System.out.println("Lukujen " + luku1 + " ja " + luku2 + " summa on " + summa);
    }
}


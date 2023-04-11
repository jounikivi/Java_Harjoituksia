package kotitehtävä9;

public class KT7 {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int randomNumber = (int) (random() * max); // muunnetaan satunnaisluku kokonaisluvuksi
        System.out.println(randomNumber);
    }

    private static double random() {
        // palauttaa satunnaisen luvun väliltä 0-1
        return Math.random();
    }
}


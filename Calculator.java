public class Calculator {

    // Constanta bonus pentru adunare
    private static final int BONUS = 5;

    // Calculeaza suma a doua numere
    public int aduna(int a, int b) {
        return a + b + BONUS;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Rezultat: " + calc.aduna(5, 10));
    }
}

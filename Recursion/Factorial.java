public class Factorial {

    public static int calcFact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact = calcFact(n - 1);
        return n * fact;
    }

    public static void main(String[] args) {
        // output(1, 5, 1);

        System.out.print(calcFact(5));
    }
}
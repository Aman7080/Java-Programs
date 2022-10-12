public class SumNatural {

    public static int calcSum(int n) {
        if (n == 0) {
            return 0;
        }
        int sum = calcSum(n - 1);
        return n + sum;
    }

    public static void main(String[] args) {
        System.out.print("Sum = "+ calcSum(10));
    }
}

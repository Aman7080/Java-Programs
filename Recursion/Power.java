public class Power {
    // for stack height n
    public static int calcPower(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return x * calcPower(x, n - 1);
    }

    // for stack height logn
    public static int calcPower2(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else {
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(calcPower(2, 5));
        System.out.println(calcPower2(2, 5));
    }
}

public class Fibonacci {
    public static void printFibonacci(int count, int a, int b) {
        int c = a + b;
        if (count == 0) {
            return;
        }
        System.out.print(c + "\t");
        a = b;
        b = c;
        printFibonacci(count - 1, a, b);
    }

    public static void main(String[] args) {
        int count = 8;
        System.out.print(0 + "\t" + 1 + "\t");
        printFibonacci(count - 2, 0, 1);
    }
}

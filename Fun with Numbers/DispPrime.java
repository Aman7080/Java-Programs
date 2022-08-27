public class DispPrime {
    public static void main(String[] args) {
        System.out.println("Prime Numbers Between 1 to 100");
        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;
            // this loop check if the number is divisible by any other number or not
            // if it divisible by any other number then if loops makes isPrime false
            for (int j = 2; j <= (i / 2); j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(i + "\t");
            }
        }
    }
}

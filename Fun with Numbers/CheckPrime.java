import java.util.Scanner;

public class CheckPrime {
    int num;
    boolean isPrime = true;

    // to take user input
    void input() {
        System.out.println("Enter A Number ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
    }

    // to check if number is prime or not
    void check() {
        for (int i = 2; i <= (num / 2); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
    }

    // to display the result
    void display() {
        if (isPrime) {
            System.out.println(num + " is Prime Number");
        } else {
            System.out.println(num + " is Not Prime Number");
        }
    }

    public static void main(String[] args) {
        CheckPrime obj = new CheckPrime();
        obj.input();
        obj.check();
        obj.display();
    }
}

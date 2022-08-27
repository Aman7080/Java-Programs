import java.util.Scanner;

public class NumReverse {
    int num;
    int revNum = 0;

    // to take user input
    void input() {
        System.out.println("Enter A Number ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
    }

    // reversing Number
    void rev() {

        while (num > 0) {
            int rem = num % 10;
            revNum = revNum * 10 + rem;
            num = num / 10;
        }
    }

    // to display the result
    void display() {
        System.out.println("Reversed Number : " + revNum);
    }

    public static void main(String[] args) {
        NumReverse obj = new NumReverse();
        obj.input();
        obj.rev();
        obj.display();
    }
}

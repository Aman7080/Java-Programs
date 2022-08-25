
import java.util.Scanner;

public class ArrayProgram {
    int arr[];
    int arrLen, i;
    Scanner sc = new Scanner(System.in);

    // to input elements in array
    void input() {
        System.out.println("How many elements you want to enter : ");
        arrLen = sc.nextInt();
        arr = new int[arrLen];
        for (i = 0; i < arrLen; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // to display elements of array
    void display() {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayProgram obj = new ArrayProgram();
        obj.input();
        obj.display();
    }
}

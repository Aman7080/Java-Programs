import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    int arrLen;
    int arr[];

    // to take user inputs
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements do you want to enter : ");
        arrLen = sc.nextInt();
        arr = new int[arrLen];
        for (int i = 0; i < arrLen; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    // to sort array
    void sortArray() {
        Arrays.sort(arr);
    }

    // to display array
    void display() {
        System.out.println("Sorted Array : ");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }

    public static void main(String[] args) {
        ArraySorting obj = new ArraySorting();
        obj.input();
        obj.sortArray();
        obj.display();
    }
}

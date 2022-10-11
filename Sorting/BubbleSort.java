public class BubbleSort {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println("Pass " + (i + 1));
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }

                display(arr);
            }
            System.out.println("***********************************\n");
        }
    }

    public static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 5, 1, 4, 2, 8 };
        sort(arr);
        // display(arr);
    }
}
public class InsertionSort {
    public static void sort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            System.out.println("Pass " + (i));
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            display(arr);
        }

    }

    public static void display(int arr[]) {
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("***********************************\n");
    }

    public static void main(String args[]) {
        int arr[] = { 5, 1, 4, 2, 8 };
        sort(arr);
        // display(arr);
    }
}

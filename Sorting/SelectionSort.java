public class SelectionSort {
    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int pos = i; //Position of minimum element
            System.out.println("Pass " + (i + 1));
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[pos]) {
                    pos = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = tmp;
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
      //  int arr[] = { 5, 1, 4, 2, 8 };
        int arr[]={56,23,67,11,45};
        sort(arr);
    }
}

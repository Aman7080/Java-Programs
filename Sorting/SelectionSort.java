public class SelectionSort {
    public static void sort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minpos = i;
            System.out.println("Pass "+ i);
            System.out.println("*************");
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[minpos]){
                    minpos =j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minpos];
            arr[minpos] = tmp;
            display(arr);
            System.out.println();
        }
     } 
     public static void display(int arr[]){
         for (int i : arr) {
             System.out.print(i+"\t");
            }
     }
    public static void main(String args[]){
        int arr[] = {5, 1, 4, 2, 8};
        sort(arr);
    }
}

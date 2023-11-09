public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int x = 0 ;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            printArray(arr);
        }
    }

    public static void printArray(int array[]) {
        int n = array.length;
        for (int i=0; i<n; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}


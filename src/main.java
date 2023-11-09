public class main {
    public static void main(String[] args) {
        int[] array = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};
        /*System.out.println("BUBBLE SORT");
        System.out.println("Original array:");
        BubbleSort.printArray(array);
        BubbleSort.bubbleSort(array);*/

        System.out.println("INSERTION SORT");
        System.out.println("Original array:");
        InsertionSort.printArray(array);
        InsertionSort.insertionSort(array);
        System.out.println("Sorted array:");
        InsertionSort.printArray(array);


    }

}

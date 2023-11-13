import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array, int inicio, int ultimo) {

        if (inicio < ultimo) {
            int partitionIndex = subArray(array, inicio, ultimo);

            quickSort(array, inicio, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, ultimo);
        }
    }

    private static int subArray(int[] array, int inicio, int ultimo) {
        int pivot = array[ultimo];
        int i = (inicio - 1);

        for (int j = inicio; j < ultimo; j++) {
            if (array[j] <= pivot) {
                i++;

                int swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
                System.out.println(Arrays.toString(array));
            }
        }

        int swapTemp = array[i + 1];
        array[i + 1] = array[ultimo];
        array[ultimo] = swapTemp;
        System.out.println(Arrays.toString(array));

        return i + 1;
    }
}


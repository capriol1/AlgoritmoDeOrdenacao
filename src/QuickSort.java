public class QuickSort {
    public static void quickSort(int[] array, int comeco, int ultimo) {
        if (comeco < ultimo) {
            int partitionIndex = partition(array, comeco, ultimo);

            quickSort(array, comeco, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, ultimo);
        }
    }

    private static int partition(int[] array, int comeco, int ultimo) {
        int pivot = array[ultimo];
        int i = (comeco - 1);

        for (int j = comeco; j < ultimo; j++) {
            if (array[j] <= pivot) {
                i++;

                int swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
                System.out.println(array.toString());
            }
        }

        int swapTemp = array[i + 1];
        array[i + 1] = array[ultimo];
        array[ultimo] = swapTemp;
        System.out.println(array.toString());

        return i + 1;
    }
}


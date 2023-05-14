package ro.ase.cts.strategy;

public class QuickSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
        System.out.println("Array sorted using Quick Sort strategy");
    }

    private void quickSort(int[] array, int low, int high) {
        if(low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for(int j = low; j < high; j++) {
            if(array[j] <= pivot) {
                i++;

                int aux = array[j];
                array[j] = array[i];
                array[i] = aux;
            }
        }
        int aux = array[i + 1];
        array[i + 1] = array[high];
        array[high] = aux;

        return i + 1;
    }
}

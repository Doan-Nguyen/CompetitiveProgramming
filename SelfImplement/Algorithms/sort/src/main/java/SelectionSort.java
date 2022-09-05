public class SelectionSort implements  Sort{
    public static void selectionSort(int[] values){
        for (int i = 0; i < values.length - 1; i++){
            //          find min of a[i+1, n - 1]
            int minIdx = i + 1;
            for (int j = i + 1; j < values.length; j++){
                if (values[j] < values[minIdx]){
                    minIdx = j;
                }
            }
            //          swap
            if (values[i] > values[minIdx]){
                Utils.swap(values, i, minIdx);
            }
            Utils.printArray(i, values);
        }
    }

    @Override
    public void sort(int[] values) {
        SelectionSort.selectionSort(values);
    }

    public static void main(String[] args) {
        int[] array = {10, 4, 6, 8, 13, 2, 3};
//        int[] array = {1, 3, 2, 4, 5, 6, 7};

        SelectionSort sorter = new SelectionSort();
        sorter.sort(array);
    }
}

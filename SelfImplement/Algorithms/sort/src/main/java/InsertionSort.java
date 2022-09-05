public class InsertionSort implements Sort{
    @Override
    public void sort(int[] values) {
        InsertionSort.insertionSort(values);
    }

    public static void insertionSort(int[] values){
        for (int i = 1; i < values.length; i ++){
            for (int j = 0; j < i; j++){
                if (values[i] < values[j]){
                    Utils.swap(values, i, j);
                }
            }
            Utils.printArray(i, values);
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 4, 6, 8, 13, 2, 3};
//        int[] array = {1, 3, 2, 4, 5, 6, 7};

        InsertionSort sorter = new InsertionSort();
        sorter.sort(array);
    }
}

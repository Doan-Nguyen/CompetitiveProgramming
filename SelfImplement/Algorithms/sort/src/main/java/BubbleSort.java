
public class BubbleSort implements Sort{
    @Override
    public void sort(int[] values) {
        BubbleSort.bubbleSort(values);
    }


    public static void bubbleSort(int[] arr){
        if (arr == null){
            return;
        }
        boolean isSorted;
        for (int i = 0; i < arr.length; i++){
            isSorted = true;
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    Utils.swap(arr, j, j + 1);
                    isSorted = false;
                }
            }
            if (isSorted){
                break;
            }
            Utils.printArray(i, arr);
        }
    }


    public static void main(String[] args) {
//        int[] array = {10, 4, 6, 8, 13, 2, 3};
        int[] array = {1, 2, 3, 4, 5, 7, 6};

        BubbleSort sorter = new BubbleSort();
        sorter.sort(array);
    }
}

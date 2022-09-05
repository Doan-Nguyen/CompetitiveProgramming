public class QuickSort {

    public static int partition(int[] arr, int l, int r){
        int pivot = arr[r];
        int i = l - 1;
        for (int j = l; j < r; i++){
            if (arr[j] < pivot){

            }
        }
        return 0;
    }
    public static void quickSort(int[] arr, int l, int r){
        if (l < r){
            int partitionIdx = partition(arr, l, r);
            quickSort(arr, l, partitionIdx - 1);
            quickSort(arr, partitionIdx + 1, r);
        }
    }

    public static void main(String[] args){
        int[] arr = {6, 7, 8, 5, 4, 1, 2, 3};
        quickSort(arr, 0, arr.length);
    }
}

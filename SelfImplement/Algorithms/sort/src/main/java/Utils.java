public class Utils {
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void printArray(int no, int[] arr){
        System.out.printf("%d: ", no);
        for (int i = 0; i < arr.length; i++){
            System.out.printf("%d: ", arr[i]);
        }
        System.out.println();
    }
}

public class DemoRecursion {
    public static void printF(){
        System.out.println("F");
        printF();
    }

    public static void printElement(int[] arr, int idx){
        //
        if (idx < 0 || idx >= arr.length)
            return;
        /* 0 -> (n - 1) */
//        System.out.println(arr[idx]);
//        printElement(arr, idx + 1);
        /*  (n - 1) -> 0 */
        printElement(arr, idx + 1);
        System.out.println(arr[idx]);

    }


    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        printElement(arr, 0);
    }
}

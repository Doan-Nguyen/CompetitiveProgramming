import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] leftArr, int[] rightArr){
        int n = leftArr.length + rightArr.length;
        int[] sortedArr = new int[n];
        int leftArrIdx = 0;
        int rightArrIdx = 0;
        int sortedArrIdx = 0;
        while (sortedArrIdx < n) {
            //          leftArr & rightArr are not empty.
            if (leftArrIdx < leftArr.length && rightArrIdx < rightArr.length){
                if (leftArr[leftArrIdx] < rightArr[rightArrIdx]){
                    sortedArr[sortedArrIdx] = leftArr[leftArrIdx];
                    leftArrIdx++;
                } else {
                    sortedArr[sortedArrIdx] = rightArr[rightArrIdx];
                    rightArrIdx++;
                }
                sortedArrIdx++;
            } else {
                if (leftArrIdx < leftArr.length){  // left array not empty
                    sortedArr[sortedArrIdx] = leftArr[leftArrIdx];
                    leftArrIdx++;
                } else {
                    sortedArr[sortedArrIdx] = rightArr[rightArrIdx];
                    rightArrIdx++;
                }
                sortedArrIdx++;
            }
        }
        return sortedArr;
    }

    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static int[] mergeSort(int[] values, int leftIdx, int rightIdx){
        //              Special cases
        if (leftIdx > rightIdx){
            return null;
        } 
        if (leftIdx == rightIdx){
            int[] singleElement =  {values[leftIdx]};
            return singleElement;
        }
        //              General
        //      Divide
        int k = (leftIdx + rightIdx - 1)/2;
        int[] leftArr = mergeSort(values, leftIdx, k);
        int[] rightArr = mergeSort(values, k + 1, rightIdx);
        //      Merge
        int[] sortedArr = merge(leftArr, rightArr);
        //
        return sortedArr;
    }

    public static void main(String[] args){
        MergeSort s = new MergeSort();
        int[] a1 = {1, 2, 8};
        int[] a2 = {4, 5, 6};
        System.out.println(Arrays.toString(s.merge(a1, a2)));

    }
}

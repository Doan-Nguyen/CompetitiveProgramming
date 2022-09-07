package TwoPointers;

import java.util.Arrays;

public class _977_Squares_of_a_Sorted_Array {
    public static int[] sortedSquares(int[] nums) {
        if (nums.length == 0){
            return null;
        } else {
            int n = nums.length;
            int[] revisedArr = new int[n];
            int s = 0;
            //
            while(s < n){
                if (Math.abs(nums[s]) >= Math.abs(nums[n - 1])){
                    //      swap
                    int tmp = nums[n - 1];
                    revisedArr[n - 1] = nums[s];
                    nums[s] = tmp;
                    s++;
                    n--;
                } else {
                    revisedArr[n - 1] = nums[n - 1];
                    n--;
                }
            }
            return revisedArr;
        }
    }

    public static void main(String[] args){
        int[] arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
}

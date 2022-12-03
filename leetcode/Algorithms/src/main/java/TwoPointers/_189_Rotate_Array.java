package TwoPointers;

import java.util.Arrays;

public class _189_Rotate_Array {
    /*  Solution 1: Using temp array
    * */
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n==0){
            return;
        }
        int new_k = k%n;
        //
        while(new_k > 0){
            int[] temp = new int[nums.length];
            temp[0] = nums[n - 1];
            for(int i = 1; i < nums.length; i++){
                temp[i] = nums[i - 1];
            }
            //
            for (int j = 0; j < nums.length; j++){
                nums[j] = temp[j];
            }
            //
            new_k--;
        }
        //
        System.out.println(Arrays.toString(nums));
    }

    /*      Solution 2: A Juggling Algorithm
    * */

//    public static void rotate(int[] nums, int k) {
//
//    }


    public static void main(String[] args){
        int[] arr = {-1,-100,3,99};
        rotate(arr, 2);
    }
}

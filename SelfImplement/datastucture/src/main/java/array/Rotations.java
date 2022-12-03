package array;

import java.util.Arrays;

public class Rotations {

    /*      Rotate an array using temp array
        Step 1: Store the elements [d, n - 1] into the temp array
        Step 2: Store the elements [0, d - 1] into the temp array
        Step 3: Copy the temp array into the original array.
    */
    protected static int[] rotateTempArray(int[] nums, int k){
        int n = nums.length;
        int[] cloneArr = nums.clone();
        int c = 0;
        k = k%n;
        //
        for (int i = n - k; i < n; i++){
            nums[c] = cloneArr[i];
            c++;
        }
        //
        for (int j = 0; j < k + 1; j++){
            nums[c] = cloneArr[j];
            c++;
        }
        //
        return nums;
    }

    /*      Rotate an array using swap sub arrays
            Step 1: split the input array to 2 sub arrays
                A : arr[0; d] & B : [d + 1; n - 1]
            Step 2:  swap util A.length() == B.length()
                if A.length() > B.length:
                    + Split A := Al + Ar | Al.length() == B.length()
                    + swap Al & B => B.Ar.Al <=> B is correct.
                    + recur on pieces of A
                else if A.length() < B.length:
                    + Split B := Bl + Br | Br.length() == A.length()
                    + swap Al & B => B.Ar.Al <=> B is correct.
                    + recur on pieces of A

    */
//    protected int[] rotateSwapSubarray(int[] arr, int d){
//
//
//
//    }

    public static void main(String[] args){
        int[] arr = {-1,-100,3,99};
        System.out.println(Arrays.toString(rotateTempArray(arr, 2)));
    }
}

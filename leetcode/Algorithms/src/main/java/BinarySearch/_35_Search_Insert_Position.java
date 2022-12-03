package BinarySearch;

public class _35_Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int n = nums.length;
        while(l < n){
            int m = l + (n - l)/2;
            if (nums[m] == target){
                return m;
            } else if (nums[m] > target){
                n = m;
            } else {
                l = m + 1;
            }
        }
        return n;
    }

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        int[] r = new int[n];
        //
        if (i > j){
            return null;
        } else if (i == j) {
            r[i] = (int) Math.pow(nums[i], 2);
        }
        int c = n - 1;
        while (i <= j){
            if (Math.abs(nums[i]) < Math.abs(nums[j])){
                r[c] = (int) Math.pow(nums[j], 2);
                j--;
            } else {
                r[c] = (int) Math.pow(nums[i], 2);
                i++;
            }
            c--;
        }
        return r;
    }

    public static void main(String[] args){
        int[] arr = {1, 3, 5, 7};
        System.out.println(searchInsert(arr, 1));
        System.out.println(searchInsert(arr, 3));
        System.out.println(searchInsert(arr, 5));
        System.out.println(searchInsert(arr, 8));
    }
}

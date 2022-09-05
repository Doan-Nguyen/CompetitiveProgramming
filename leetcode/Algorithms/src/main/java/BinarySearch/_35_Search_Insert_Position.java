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

    public static void main(String[] args){
        int[] arr = {1, 3, 5, 7};
        System.out.println(searchInsert(arr, 1));
        System.out.println(searchInsert(arr, 3));
        System.out.println(searchInsert(arr, 5));
        System.out.println(searchInsert(arr, 8));
    }
}

package BinarySearch;

public class _704_Binary_Search {
    public static int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        while (l <= h){
            int m = l + (h - l)/2;
            if (nums[m] == target){
                return m;
            } else if (nums[m] < target){
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        //
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums, 3));
    }
}

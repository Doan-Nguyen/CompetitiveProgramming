package SlidingWindow;

public class _219_Contains_Duplicate_II {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        k = k + 1;
        for (int i = 0; i <= nums.length - k; i++) {
            int firstValue = nums[i];
            for (int j = 1; j < k; j++) {
                if (firstValue == nums[i + j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,1}; //{99, 99}; // {1,2, 3, 1, 2, 3}; //     //
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}

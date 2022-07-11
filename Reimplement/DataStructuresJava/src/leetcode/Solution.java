package leetcode;

import java.util.*;


class Solution {
    public boolean containsDuplicate(int[] nums) {
        int[] tmpNums = nums;
        Map<Integer, Integer> mapIndexValues = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            mapIndexValues.put(nums[i], i);
        }
        if (nums.length > mapIndexValues.size()){
            return false;
        }
        return true;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapValueIndex = new HashMap<>();
        for (int i=0; i < nums.length; i++){
            int currValue = nums[i];
            mapValueIndex.getOrDefault(currValue, i);
        }
        TreeMap<Integer, Integer> sortedMap = new TreeMap<Integer, Integer>(mapValueIndex);
        System.out.println(sortedMap);
        //
        int i = 0;
        int j = mapValueIndex.size() - 1;
//        while(i < j){
//            if (sortedMap.)
//        }
        int[] output = {1, 2};
        return output;
    }


    public static void main(String argr[]){
        Solution slt = new Solution();
        int[] nums = new int [] {3,3};
        int[] status = slt.twoSum(nums, 9);
        System.out.println(status);
    }

}
package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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


    public static void main(String argr[]){
        Solution slt = new Solution();
        int[] nums = new int [] {1,2,3,1};
        boolean status = slt.containsDuplicate(nums);
        System.out.println(status);
    }

}
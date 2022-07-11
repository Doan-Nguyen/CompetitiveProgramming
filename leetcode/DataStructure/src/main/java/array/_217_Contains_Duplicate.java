package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class _217_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> setElements = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            if(setElements.contains(nums[i])){
                return true;
            }
            setElements.add(nums[i]);
        }
        return false;
    }
}

package SlidingWindow;

import java.util.ArrayDeque;
import java.util.List;

public class SlidingWindowMaximum {
    public static ArrayDeque<Integer> findMaxSlidingWindow(List<Integer> nums, int windowSize) {
        ArrayDeque<Integer> result = new ArrayDeque<>();
        //
        if (nums.size() < windowSize) {
            for (Integer num: nums) {
                result.add(num);
            }
        }
        for (int i = 0; i <= nums.size() - windowSize; i++) {
            Integer max = nums.get(i);
            for (int j = 1; j < windowSize; j++) {
                if (nums.get(i + j) > max) {
                    max = nums.get(i + j);
                }
            }
            result.add(max);
        }
        //
        return result;
    }
}

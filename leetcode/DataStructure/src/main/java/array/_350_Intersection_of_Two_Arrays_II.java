package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _350_Intersection_of_Two_Arrays_II {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        //
        if(nums1.length * nums2.length == 0){
            return null;
        }
        //
        if(nums1[0]  > nums2[nums2.length - 1] || nums1[nums1.length - 1] < nums2[0]){
            return null;
        }
        //
        List<Integer> listIntersec = new ArrayList<>();
        int[] longerArray = new int[1];
        int[] shorterArray = new int[1];
        if(nums1.length > nums2.length){
            longerArray = Arrays.copyOf(nums1, nums1.length);
            shorterArray = Arrays.copyOf(nums2, nums2.length);
        }else {
            longerArray = Arrays.copyOf(nums2, nums2.length);
            shorterArray = Arrays.copyOf(nums1, nums1.length);
        }
        //
        int j = 0;
        int i = 0;
        while(i < longerArray.length & j < shorterArray.length){
            if(longerArray[i] == shorterArray[j]){
                listIntersec.add(longerArray[i]);
                j++;
                i++;
            } else if (longerArray[i] > shorterArray[j]){
                j++;
            } else{
                i++;
            }
        }

        //
        int[] result = new int[listIntersec.size()];
        for (int k = 0; k < listIntersec.size(); k++){
            result[k] = listIntersec.get(k);
            System.out.println(result[k]);
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = intersect(nums1, nums2);
//        System.out.println(result.toString());
    }
}

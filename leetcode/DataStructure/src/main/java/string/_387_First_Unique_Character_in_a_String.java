package string;

import java.util.*;

public class _387_First_Unique_Character_in_a_String {
    public static int firstUniqChar(String s) {
        char[] arr = s.toCharArray();

        int[] count = new int[123];

        for (int i = 0; i < arr.length; i++){
            int currCharIdx = (int) arr[i];
            count[currCharIdx]++;
        }
        for (int j = 0; j < arr.length; j++){
            int currCharIdx = (int) arr[j];
            if (count[currCharIdx] == 1){
                return j;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int index = firstUniqChar("leetcode");
        System.out.println(index);
    }
}

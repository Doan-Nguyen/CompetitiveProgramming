/*
Type of elements: letters and numbers

* A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
*
* Input: s = " "
Output: true
* */

package array;

import java.util.ArrayList;
import java.util.List;

public class _125_Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        String lowerString = s.toLowerCase();
        char[] listChars = lowerString.toCharArray();
        List<Integer> listNumb = new ArrayList<>();
        //
        for (char c: listChars){
            int indexChar = (int) c;
            if (indexChar  > 96 && indexChar < 123 || indexChar > 47 && indexChar < 58){
                listNumb.add(indexChar);
            }
        }
        //
        if(listNumb.size() == 0){
            return true;
        }
        //
        int lenNumb = listNumb.size();
        for(int i = 0; i < lenNumb/2; i ++){
            if(listNumb.get(i) != listNumb.get(lenNumb - 1 - i) || i == lenNumb - 1 - i){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        boolean r = isPalindrome("a");
        System.out.println(r);
    }
}

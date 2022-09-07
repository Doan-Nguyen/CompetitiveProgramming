/*
*   Alphanumeric characters include:
*       - letters - lowercase (acsii: 97 - 122)
*       - numbers - (ascii: 48 - 57)
*   Convert string to list of characters:
*         String lowerString = s.toLowerCase();
*         char[] listChars = lowerString.toCharArray();
*   Refer: https://www.javatpoint.com/java-ascii-table#:~:text=ASCII%20is%20a%207%2Dbit,ASCII%20values%20for%20each%20character.
* */

package TwoPointers;

import java.util.ArrayList;
import java.util.List;

public class _125_Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        String lowerString = s.toLowerCase();
        char[] listChars = lowerString.toCharArray();
        //
        List<Integer> listNumb = new ArrayList<>();
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

    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}

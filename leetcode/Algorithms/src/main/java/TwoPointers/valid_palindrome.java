package TwoPointers;

public class valid_palindrome {
    public static boolean isPalindrome(String s) {
        // Write your code here
        // Tip: You may use the code template provided
        // in the TwoPointers.java file
        int left = 0;
        int right = s.length() - 1;
        if (left > right) {
            return false;
        }
        while (left <= right){
            if (s.charAt(left) != (s.charAt(right))) {
                return false;
            } else {
                left = left + 1;
                right = right -1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A"));
    }
}

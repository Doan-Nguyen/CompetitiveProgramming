package stack;

import java.util.Stack;

/*          Solve
    Y tuong: kiem tra tung ki tu, neu la:

    + Notes:
        - s.charAt(i)
* */
public class _20_Valid_Parentheses {
    public static boolean isValid(String s) {
        Stack<Character> openBrackets = new Stack<Character>();
        //
        for (int i = 0; i < s.length(); i++){
            if (openBrackets.isEmpty() &&
                    (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')){
                return false;
            } else {
                if (!openBrackets.isEmpty()){       // <~>
                    if (s.charAt(i) == ']' && openBrackets.peek() == '[' ||
                        s.charAt(i) == ')' && openBrackets.peek() == '(' ||
                        s.charAt(i) == '}' && openBrackets.peek() == '{') {
                        openBrackets.pop();
                    } else {
                        openBrackets.add(s.charAt(i));
                    }
                } else {
                    openBrackets.add(s.charAt(i));
                }
            }
        }
        return openBrackets.isEmpty();
    }

    public static void main(String args[]){
        System.out.println(isValid("({[)")); // ()[]{}
    }

}

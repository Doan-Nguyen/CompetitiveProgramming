package stack;

import java.util.Stack;


/*  idea: su dung stack luu co thu tu cac dau mo ngoac.
    + neu gap dau mo ngoac thi luu vao stack
    + Cu gap dau dong ngoac thi kiem tra dinh cua stack
*   -> end: stack.isEmpty() -> ok
*
* */
public class _20_Valid_Parentheses {
    public static boolean isValid(String s) {
        /*      tao 1 stack
        *   - luu cac dau mo ngoac '(', '[', '{'
        * */
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else {
                if (!stack.isEmpty()){
                    return false;
                }
                //
                char openPeek = stack.peek();
                //      kiem tra dau mo ngoac hien tai co la 1 cap voi dau o dinh stack
                if((c == ')' && openPeek == '(')
                    || (c == '}' && openPeek == '{')
                    || (c == ']' && openPeek == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String args[]){
        System.out.println(isValid("(]"));
    }
}

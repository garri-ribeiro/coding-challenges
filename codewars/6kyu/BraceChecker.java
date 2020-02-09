// [6kyu] Valid Braces
// https://www.codewars.com/kata/5277c8a221e209d3f6000b56/java

import java.util.Stack;

public class BraceChecker {

    public boolean isValid(String braces) {
        char[] chars = braces.toCharArray();
        int size = chars.length;
        Stack<Character> stack = new Stack<>();

        for(char character  : chars) {
            if (character == '(' || character == '[' || character == '{') {
                stack.push(character);
            } else if (character == ')' || character == ']' || character == '}') {
                if(stack.empty()) return false;

                char popCh = stack.pop();
                if(character == ')' && popCh != '('
                        || character == ']' && popCh != '['
                        || character == '}' && popCh != '{')
                    return false;
            }
        }

        if(!stack.isEmpty()) return false;

        return true;
    }

}

package String_Questions;

import java.util.Stack;

public class String_isStringBalances_Stack {

    boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();
        for(char i : str.toCharArray()){
            switch(i) {
                case '{':
                case '(':
                    stack.push(i);
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}



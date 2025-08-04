package Stack_Queue;

import java.util.Stack;

public class Valid_Parentheses {
    public boolean compareBrackets(char first, char second){
        return ((first == '(' && second ==')') || (first == '[' && second ==']') || (first == '{' && second =='}'));
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char bracket : s.toCharArray()){
            if((bracket == '(') || (bracket == '[') || (bracket == '{')){
                stack.push(bracket);
            }
            else if(! stack.isEmpty() && compareBrackets(stack.peek(), bracket)){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}

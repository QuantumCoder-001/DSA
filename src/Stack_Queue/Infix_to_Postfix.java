package Stack_Queue;

import java.util.Stack;

public class Infix_to_Postfix {
    public static String infixToPostfix(String s) {
        // code here
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                result.append(ch);
            }
            else if(ch == '('){
                stack.push(ch);
            }
            else if(ch == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())){
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.toString();
    }
    public static int precedence(char op){
        return switch (op) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> 0;
        };
    }
}

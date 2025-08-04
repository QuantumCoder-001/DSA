package Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Basic_Calculator_II {
    public int calculate(String s) {
        int n = s.length();
        Deque<Integer> stack = new ArrayDeque<>();
        char operator = '+';
        int num = 0;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num = num*10 + (ch - '0');
            }
            if(!Character.isDigit(ch) && ch != ' ' || i == n-1){
                switch(operator){
                    case '+' -> stack.push(num);
                    case '-' -> stack.push(-num);
                    case '/' -> stack.push(stack.pop() / num);
                    case '*' -> stack.push(stack.pop() * num);
                }
                operator = ch;
                num = 0;
            }
        }
        int result = 0;
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }
}

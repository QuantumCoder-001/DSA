package Stack_Queue;

import java.util.Stack;

public class Sort_Stack {
    public Stack<Integer> sort(Stack<Integer> s) {
        // add code here.
        if(s.isEmpty()){
            return s;
        }
        int top = s.pop();
        sort(s);
        sorting(s,top);
        return s;
    }

    static void sorting(Stack<Integer> stack, int topValue){
        if(stack.isEmpty() || stack.peek() <= topValue){
            stack.push(topValue);
            return;
        }
        int top = stack.pop();
        sorting(stack, topValue);
        stack.push(top);
    }
}

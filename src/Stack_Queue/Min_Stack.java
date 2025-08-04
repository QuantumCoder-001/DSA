package Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Min_Stack {
    Deque<Integer> minStack;
    Deque<Integer> mainStack;
    public Min_Stack() {
        minStack = new ArrayDeque<>();
        mainStack = new ArrayDeque<>();
    }

    public void push(int val) {
        mainStack.push(val);
        if(minStack.isEmpty() || minStack.peek() >= val){
            minStack.push(val);
        }
        else{
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        minStack.pop();
        mainStack.pop();
    }

    public int top() {
        if(!mainStack.isEmpty()){
            return mainStack.peek();
        }
        return -1;
    }

    public int getMin() {
        if(!minStack.isEmpty()){
            return minStack.peek();
        }
        return -1;
    }
}

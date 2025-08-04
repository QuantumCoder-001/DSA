package Stack_Queue;

import java.util.ArrayList;
import java.util.Stack;

public class Stock_span_problem {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int day = 0; day<n; day++){
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[day]){
                stack.pop();
            }
            list.add(stack.isEmpty()? day+1: day-stack.peek());
            stack.push(day);
        }
        return list;
    }
}

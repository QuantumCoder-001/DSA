package Stack_Queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Next_Greater_Element {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length-1;
        for(int i = n; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            list.add(stack.isEmpty()? -1: stack.peek());
            stack.push(arr[i]);
        }
        Collections.reverse(list);
        return list;
    }
}

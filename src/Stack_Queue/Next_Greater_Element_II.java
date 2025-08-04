package Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Next_Greater_Element_II {
    public int[] nextGreaterElements(int[] nums) {
        int n =  nums.length;
        int[] result = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 2*n-1; i>=0; i--){
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[i%n]){
                stack.pop();
            }
            result[i%n] = stack.isEmpty()? -1: nums[stack.peek()];
            stack.push(i%n);
        }
        return result;
    }
}

package Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Daily_Temperatures {
    public int[] dailyTemperatures(int[] temp) {
        Deque<Integer> stack = new ArrayDeque<>();
        int n = temp.length;
        int[] result = new int[n];
        for(int i = n-1; i>=0; i--){
            while(!stack.isEmpty() && temp[i] >= temp[stack.peek()]){
                stack.pop();
            }
            result[i] = stack.isEmpty()? 0: stack.peek()-i;
            stack.push(i);
        }
        return result;
    }
}

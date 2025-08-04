package Stack_Queue;

import java.util.Stack;

public class Asteroid_Collision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        boolean isSame = false;
        for(int i : asteroids){
            isSame = false;
            while(!stack.isEmpty() && (i<0 && stack.peek()>0)){
                if(stack.peek() < -i){
                    stack.pop();
                    continue;
                }
                else if(stack.peek() == -i){
                    stack.pop();
                }
                isSame = true;
                break;
            }
            if(!isSame){
                stack.push(i);
            }
        }
        int[] result = new int[stack.size()];
        int k = 0;
        for(int j : stack){
            result[k++] = j;
        }
        return result;
    }
}

package Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_using_Queue {
    Queue<Integer> queue;
    public Implement_Stack_using_Queue() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        for(int i = 0; i<queue.size()-1; i++){
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        if(!queue.isEmpty()){
            return queue.peek();
        }
        return -1;
    }
    public boolean empty() {
        return queue.isEmpty();
    }
}

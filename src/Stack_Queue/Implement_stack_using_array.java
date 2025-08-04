package Stack_Queue;

public class Implement_stack_using_array {
    private int[] arr;
    private int top;

    public Implement_stack_using_array() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        arr[++top] = x;
    }

    public int pop() {
        if(top == -1){
            return -1;
        }
        else{
            return arr[top--];
        }
    }
}

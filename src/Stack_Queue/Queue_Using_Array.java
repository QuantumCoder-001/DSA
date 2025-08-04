package Stack_Queue;

public class Queue_Using_Array {
    int front, rear;
    int[] arr = new int[100005];

    Queue_Using_Array() {
        front = 0;
        rear = 0;
    }

    void push(int x) {
        if(front<arr.length-1){
            arr[front++] = x;
        }
    }

    int pop() {
        if(rear == front){
            return -1;
        }
        return arr[rear++];
    }
}

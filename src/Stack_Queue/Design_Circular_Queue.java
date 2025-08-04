package Stack_Queue;

public class Design_Circular_Queue {
    int [] arr;
    int size;
    int front;
    int rear;
    int count;

    public Design_Circular_Queue(int k) {
        size = k;
        arr = new int[k];
        front = rear = count = 0;
    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        arr[rear] = value;
        count++;
        rear = (rear + 1) % size;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front = (front+1) % size;
        count--;
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return arr[front];
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return arr[(rear-1 + size) % size];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }
}

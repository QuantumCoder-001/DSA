package Stack_Queue;
class QueueNode {
    int data;
    QueueNode next;
    QueueNode(int a)
    {
        data = a;
        next = null;
    }
}
public class Queue_using_LinkedList {
    QueueNode front, rear;
    void push(int a){
        QueueNode node = new QueueNode(a);
        if(rear == null){
            rear = front = node;
        }
        else{
            front.next = node;
            front = node;
        }
    }

    int pop(){
        if(rear == null){
            return -1;
        }
        else{
            int x = rear.data;
            rear = rear.next;
            return x;
        }
    }
}

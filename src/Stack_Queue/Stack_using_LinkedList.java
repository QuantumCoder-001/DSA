package Stack_Queue;

class StackNode {
    int data;
    StackNode next;
    StackNode(int a) {
        data = a;
        next = null;
    }
}
public class Stack_using_LinkedList {
    StackNode top;

    void push(int a) {
        StackNode node = new StackNode(a);
        node.next = top;
        top = node;
    }

    int pop() {
        if(top == null){
            return -1;
        }
        else{
            int x = top.data;
            top = top.next;
            return x;
        }
    }
}

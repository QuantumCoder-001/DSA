package Stack_Queue;

import java.util.Stack;

class Implement_Queue_using_Stacks{
    Stack<Integer> inStack;
    Stack <Integer> outStack;
    public Implement_Queue_using_Stacks() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }
    public void shiftElements(Stack <Integer> inStack, Stack <Integer> outStack){
        if(outStack.isEmpty()){
            while(!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
    }

    public void push(int x) {
        inStack.push(x);

    }

    public int pop() {
        shiftElements(inStack, outStack);
        return outStack.pop();

    }

    public int peek() {
        shiftElements(inStack, outStack);
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
}
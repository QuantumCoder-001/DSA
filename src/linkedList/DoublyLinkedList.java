package linkedList;
class DNode<T>{
    T data;
    DNode<T> next;
    DNode<T> prev;
    DNode(T data){
        this.data = data;
    }
}
public class DoublyLinkedList<T> {
    DNode<T> head;
    int size;
     DNode<T> createNode(T data){
        return new DNode<>(data);
    }
    public void addAtEnd(T data){
         DNode<T> newnode = new DNode<>(data);
         if(head == null){
             head = newnode;
         }
         else{
             DNode<T> temp = head;
             while(temp.next!=null){
                 temp = temp.next;
             }
             newnode.prev = temp;
             temp.next = newnode;
         }
         size += 1;
    }
    public void addAtHead(T data){
        DNode<T> newnode = new DNode<>(data);
        if(head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
        size+=1;
    }
    public void addAtIndex(T data, int index){
        if (index < 0 || index > size) {
            return;
        }
        else if(index == 0){
            addAtHead(data);
        }
        else if(index == size){
            addAtEnd(data);
        }
        else{
            DNode<T> newnode = new DNode<>(data);
            DNode<T> temp = head;
            int i = 0;
            while(i<index-1){
                temp = temp.next;
                i++;
            }
            newnode.next = temp.next;
            newnode.prev = temp;
            temp.next.prev = newnode;
            temp.next = newnode;
            size++;
        }
    }
    public void deleteAtIndex(int index){
        if (index < 0 || index > size) {
            return;
        }
        else{
            DNode<T> temp = head;
            int i = 1;
            while(i<index){
                temp = temp.next;
                i++;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;

            size--;
        }
    }
}

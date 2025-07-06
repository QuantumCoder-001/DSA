package linkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class designLinkedList_LC707 {
    Node head;
    int size;
    public int get(int index){
        if(index<0 || index>=size){
            return -1;
        }
       else{
           Node temp = head;
           int i = 0;
           while (i<index){
               temp = temp.next;
               i++;
           }
           return temp.val;
        }
    }
    public void addAtHead(int val){
        Node node = new Node(val);
        size+=1;
        if(head == null){
            head = node;
        }
        else{
            node.next = head;
            head = node;
        }
    }
    public void addAtTail(int val){
        Node node = new Node(val);
        size+=1;
        if (head == null){
            head = node;
        }
        else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public void addAtIndex(int index, int val){
        if(index<0 || index>size){
            return;
        }
        else if(index == 0){
            addAtHead(val);
        }
        else if(index == size){
            addAtTail(val);
        }
        else{
            Node node = new Node(val);
            Node temp = head;
            int  i = 0;
            while(i<index-1){
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
            size+=1;
        }
    }
    public void deleteAtIndex(int index){
        if(index<0 || index>=size){
            return;
        } else if (index == 0) {
            head = head.next;
        } else{
            Node temp = head;
            int i = 0;
            while (i<index-1){
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
        }
        size--;
    }
}

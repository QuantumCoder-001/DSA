package linkedList;

public class ReverseLinkedList {
    public Node reverseList(Node head) {
        Node current = head;
        Node prev = null;
        Node nxt;
        while(current!=null){
            nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }
        return prev;
    }
}
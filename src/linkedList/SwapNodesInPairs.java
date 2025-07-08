package linkedList;

public class SwapNodesInPairs {
    public Node swapNodes(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = head.next;
        Node current = head;
        Node prev = null;
        Node next;
        Node first;
        Node second;
        while(current != null && current.next != null){
            first = current;
            second = current.next;
            next = second.next;
            second.next = first;
            first.next = next;
            if(prev != null) {
                prev.next = second;
            }
            prev = first;
            current = next;
        }
        return newHead;
    }
}

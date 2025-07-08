package linkedList;

public class MiddleofLL {
    Node head;
    Node slow = head;
    Node fast = head;

    public Node middle(){
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
}

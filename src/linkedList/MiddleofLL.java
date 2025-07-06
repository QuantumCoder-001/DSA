package linkedList;
class Nodee{
    int data;
    Nodee next;
}

public class MiddleofLL {
    Nodee head;
    Nodee slow = head;
    Nodee fast = head;

    public Nodee middle(){
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }
}

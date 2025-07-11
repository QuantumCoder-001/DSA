package linkedList;

public class SortList {
    public Node sortlist(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node mid = findMid(head);
        Node secondPart = mid.next;
        mid.next = null;

        Node left = sortlist(head);
        Node right = sortlist(secondPart);

        return mergeList(left,right);
    }
    private Node findMid(Node head){
        Node fast = head.next;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    private Node mergeList(Node lefty, Node righty){
        Node temp = new Node(0);
        Node tail = temp;
        while(lefty != null && righty != null){
            if(lefty.val < righty.val){
                tail.next = lefty;
                lefty = lefty.next;
            }
            else{
                tail.next = righty;
                righty = righty.next;
            }
            tail = tail.next;
        }
        tail.next = (lefty != null)? lefty: righty;
        return temp.next;
    }
}

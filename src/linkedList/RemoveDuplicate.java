package linkedList;

public class RemoveDuplicate {
    public Node removeDuplicates(Node head){
        if(head == null){
            return null;
        }
        Node temp = head;
        while(temp.next!=null){
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }
}

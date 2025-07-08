package linkedList;
class Node2{
    Node2 next;
    int data;
}
public class RemoveNthElement_FromLast {

    public Node2 removeNthFromLast(Node2 head, int n){
        if(head == null){
            return null;
        }
        int size = 0;
        Node2 temp = head;
        while(temp!=null){
            temp = temp.next;
            size += 1;
        }
        int reach = size-n;
        if(reach == 0){
            return  head.next;
        }
        temp = head;
        int i = 0;
        while(i<reach-1){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

}

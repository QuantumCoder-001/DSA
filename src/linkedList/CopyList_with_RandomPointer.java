package linkedList;
import java.util.HashMap;
import java.util.Map;
class Node3{
    Node3 next;
    int val;
    Node3 random;
    public Node3(int val){
        this.val = val;
    }
}

public class CopyList_with_RandomPointer {
    public Node3 copyRandomList(Node3 head) {
        if(head == null){
            return null;
        }
        Map<Node3, Node3> map = new HashMap<>();
        Node3 temp = head;
        Node3 newHead = new Node3(-1);
        Node3 currentHead = newHead;
        while(temp != null){
            Node3 node = new Node3(temp.val);
            map.put(temp,node);
            currentHead.next = node;
            currentHead = node;
            temp = temp.next;
        }
        currentHead = newHead.next;
        temp = head;
        while(temp != null){
            currentHead.random = map.get(temp.random);
            currentHead = currentHead.next;
            temp = temp.next;
        }
        return newHead.next;

    }
}

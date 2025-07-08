package linkedList;

class Node3{
    Node3 next;
    int val;
}
public class Intersection {
    public Node3 getIntersectionNode(Node3 headA, Node3 headB){
        if(headA == null || headB == null){
            return null;
        }
        Node3 a = headA;
        Node3 b = headB;
        while(a!=b){
            a = (a==null)? headB: a.next;
            b = (b==null)? headA: b.next;
        }
        return a;
    }
}

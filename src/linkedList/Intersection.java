package linkedList;

public class Intersection {
    public Node getIntersectionNode(Node headA, Node headB){
        if(headA == null || headB == null){
            return null;
        }
        Node a = headA;
        Node b = headB;
        while(a!=b){
            a = (a==null)? headB: a.next;
            b = (b==null)? headA: b.next;
        }
        return a;
    }
}

package linkedList;

class NodeDb{
    public NodeDb next;
    NodeDb child;
    NodeDb prev;
    int value;

}
public class FlattenDoublyList {
    public NodeDb flatten(NodeDb head){
        NodeDb temp = head;

        while (temp != null){
            if(temp.child != null){
                NodeDb nxt = temp.next;

                NodeDb tail = flattenGetTail(temp.child);

                temp.child.prev = temp;
                temp.next = temp.child;
                temp.child = null;

                tail.next = nxt;
                if(nxt != null){
                    nxt.prev = tail;
                }
            }
            temp = temp.next;
        }
        return head;
    }

    private NodeDb flattenGetTail(NodeDb head){
        NodeDb current = head;
        NodeDb tail = head;
        while(current != null){
            NodeDb nxt = current.next;
            if(current.child != null){
                NodeDb childTail = flattenGetTail(current.child);
                current.next = current.child;
                current.child.prev = current;
                current.child = null;

                childTail.next = nxt;
                if(nxt != null){
                    nxt.prev = childTail;
                }
                tail = childTail;
                current = nxt;
            }
            else {
                tail = current;
                current = current.next;
            }
        }
        return tail;

    }

}

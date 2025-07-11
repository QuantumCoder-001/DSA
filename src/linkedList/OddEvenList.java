package linkedList;

public class OddEvenList {
    public Node oddeven(Node odd){
        if(odd == null || odd.next == null){
            return odd;
        }
        Node oddCurrent = odd;
        Node even = odd.next;
        Node evenCurrent = even;

        while (evenCurrent != null && evenCurrent.next != null){
            oddCurrent.next = evenCurrent.next;
            oddCurrent = oddCurrent.next;
            evenCurrent.next = oddCurrent.next;
            evenCurrent = evenCurrent.next;
        }
        oddCurrent.next = even;
        return odd;
    }
}

package linkedList;
public class MergeTwoSorted {
    public Node mergeTwoLists(Node list1, Node list2){
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        Node head;

        if(list1.val<=list2.val){
            head = list1;
            list1 = list1.next;
        }
        else{
            head = list2;
            list2 = list2.next;
        }
        Node temp = head;
        while (list1 != null && list2 != null){
            if(list1.val<= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        temp.next = (list1==null)? list2: list1;
        return head;
    }
}

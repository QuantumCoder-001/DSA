package others;



public class ques {

    // Define Node class
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        // Create a cycle in the linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;  // Creates cycle

        // Floyd's Cycle Detection Algorithm
        Node slow = head, fast = head;

        do {
            slow = slow.next;
            fast = fast.next.next;
        } while (slow != fast);

        System.out.println("Cycle detected at node with data: " + slow.data);
    }
}

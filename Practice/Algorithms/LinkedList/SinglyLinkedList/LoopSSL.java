package Practice.Algorithms.LinkedList.SinglyLinkedList;

public class LoopSSL {
    public static void main(String[] args) {
        SinglyLinkedList ssl = new SinglyLinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = head.next.next.next;

        detectAndBreakLoop(head);
    }

    public static void detectAndBreakLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast!= null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.equals(fast)) {
                break;
            }
        }
        if (fast != null && fast.next != null && slow.equals(fast)) {
            int length = 1;
            fast = fast.next;
            while (!slow.equals(fast)) {
                fast = fast.next;
                length++;
            }
            System.out.println("Length of loop is : " + length);
            slow = head;
            while (length-- > 0) {
                slow = slow.next;
            }
            while (!slow.equals(fast)) {
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
    }
}
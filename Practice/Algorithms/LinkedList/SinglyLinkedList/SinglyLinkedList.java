package Practice.Algorithms.LinkedList.SinglyLinkedList;

public class SinglyLinkedList {
    private Node head = null;
    public void addToEndOfList(int value) {
        Node newVal = createNode(value);
        if (head == null) {
            head = newVal;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newVal;
        }
    }

    public void deleteNthFromEnd(int n) {

    }

    public void displayElementsInSSL() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }

        Node prev = null;
        Node temp = head;
        while(temp != null) {
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head = prev;
    }

    private Node createNode(int value) {
        return new Node(value);
    }
}

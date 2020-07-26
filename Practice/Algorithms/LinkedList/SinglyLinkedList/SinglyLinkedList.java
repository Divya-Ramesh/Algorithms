package Practice.Algorithms.LinkedList.SinglyLinkedList;

public class SinglyLinkedList {
    private Node head = null;
    public void endInsertion(int value) {
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

    public void frontInsertion(int value) {
        Node newVal = createNode(value);
        newVal.next = head;
        head = newVal;
    }

    public void afterNodeInsertion(int value, Node prevNode) {
        if (prevNode == null)  {
            System.out.println("Previous node is not valid");
            return;
        }
        Node newVal = createNode(value);
        newVal.next = prevNode.next;
        prevNode.next = newVal;
    }

    public void deleteKey(int value) {
        if (head == null) {
            System.out.println("Empty List!");
            return;
        }
        Node temp = head;
        boolean found = false;
        Node prev = null;
        while(!found && temp!= null) {
            if (temp.value == value) {
                found = true;
                if (prev == null) {
                    head = temp.next;
                } else {
                    prev.next = temp.next;
                }
                temp.next = null;
            }
            prev = temp;
            temp = temp.next;
        }
        if (!found) {
            System.out.println("The given key is not present in the list");
        }
    }

    public void deletePos(int pos) {
        if (head == null) {
            System.out.println("Empty List!");
            return;
        }
        if (pos == 0) {
            head = head.next; return;
        }
        Node temp = head;
        Node prev = head;
        while (pos -- > 0) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        temp.next = null;
    }

    public int getLength() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp =  temp.next;
        }
        return count;
    }

    public Node search(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public Node getNthFromEnd(int n) {
        Node temp = head;
        Node nthNode = head;
        while (--n > 0) {
            nthNode = nthNode.next;
        }
        while (nthNode.next != null) {
            temp = temp.next;
            nthNode = nthNode.next;
        }
        return temp;
    }

    public Node getNthFromFront(int n) {
        Node nthNode = head;
        while (--n > 0) {
            nthNode = nthNode.next;
        }
        return nthNode;
    }

    public Node getMiddle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public void displayElementsInSSL() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    private Node createNode(int value) {
        return new Node(value);
    }
}

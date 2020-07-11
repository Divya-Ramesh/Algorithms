package com.Practice.Algorithms.LinkedList;

public class SinglyLinkedList {
    private Node head = null;
    public void add(int value) {
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

    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }

        Node prev = head;
        Node temp = head.next;
        while(temp != null) {
            Node next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        head.next = null;
        head = prev;
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

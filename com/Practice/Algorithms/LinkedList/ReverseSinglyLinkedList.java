package com.Practice.Algorithms.LinkedList;

public class ReverseSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList ssl = new SinglyLinkedList();
        ssl.add(10);
        ssl.add(20);
        ssl.add(30);
        ssl.add(40);
        ssl.add(50);
        ssl.reverseList();
        ssl.displayElementsInSSL();
    }
}

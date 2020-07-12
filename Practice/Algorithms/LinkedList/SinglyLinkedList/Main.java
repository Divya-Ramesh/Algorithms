package Practice.Algorithms.LinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList ssl = new SinglyLinkedList();
        ssl.addToEndOfList(50);
        ssl.addToEndOfList(40);
        ssl.addToEndOfList(30);
        ssl.addToEndOfList(20);
        ssl.addToEndOfList(10);
        ssl.reverseList();
        /*ssl.displayElementsInSSL();*/
        ssl.deleteNthFromEnd(4);
        ssl.displayElementsInSSL();
    }
}

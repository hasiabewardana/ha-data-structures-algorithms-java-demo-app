package datastructures.linear.linkedlist;

public class LinkedListDemo {
    public static void demoLinkedList(){
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);
        linkedList.traverse();
    }
}

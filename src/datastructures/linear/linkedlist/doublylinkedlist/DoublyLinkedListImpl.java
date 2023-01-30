package datastructures.linear.linkedlist.doublylinkedlist;

public class DoublyLinkedListImpl {
    Node head;
    Node tail;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void printList() {
        Node current = head;

        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

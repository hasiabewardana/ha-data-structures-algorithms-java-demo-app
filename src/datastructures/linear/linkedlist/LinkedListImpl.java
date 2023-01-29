package datastructures.linear.linkedlist;

public class LinkedListImpl {
    Node head;

    public void insert(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void traverse(){
        Node current = head;

        while(current!=null){
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
}

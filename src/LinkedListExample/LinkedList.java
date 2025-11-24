package LinkedListExample;


class Node {
    int data;
    Node next;

    // Here i create a new constructor
    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class LinkedList {

    Node head = null;

    // Add a new value
    public void add(int data) {

        Node newNode = new Node(data);

        Node current = head;

        if (head == null) head = newNode;
        else {
            while (current.next != null) current = current.next;
            current.next = newNode; // attach the new node at the end
        }
    }

    // print the values
    public void printValues() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

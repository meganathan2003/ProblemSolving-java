// Here we will write the code in linkedlist


class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
};


// Create a new class callled LinkedList
class LinkedList {

    constructor() {
        this.head = null;
    }

    // Create a new method to add new node
    addFirst(data) {
        let newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    };

    // Method for add a new element
    add(data) {
        let newNode = new Node(data);
        let current = this.head;

        if (this.head === null) this.head = newNode;
        else {
            while (current.next !== null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
}

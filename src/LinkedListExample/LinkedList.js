class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {

    constructor() {
        this.head = null;
    }

    addFirst(data) {
        let newNode = new Node(data);
        console.log("Adding at first:", newNode);

        newNode.next = this.head;
        this.head = newNode;

        console.log("New HEAD →", this.head);
        console.log("---------------------");
    }

    add(data) {
        let newNode = new Node(data);
        console.log("Adding:", newNode);

        if (this.head === null) {
            this.head = newNode;
            console.log("List empty. HEAD →", this.head);
            console.log("---------------------");
            return;
        }

        let current = this.head;
        console.log("Start at HEAD:", current);

        while (current.next !== null) {
            console.log("At node:", current.data, " → moving to next");
            current = current.next;
        }

        console.log("Reached last node:", current.data);
        current.next = newNode;

        console.log("Added new node at end →", current.next);
        console.log("---------------------");
    }

    delete(data) {
        console.log("Deleting:", data);
        console.log("Current HEAD:", this.head);

        // Delete head
        if (this.head !== null && this.head.data === data) {
            console.log("Deleting HEAD node:", this.head.data);
            this.head = this.head.next;
            console.log("New HEAD:", this.head);
            console.log("---------------------");
            return;
        }

        let current = this.head;
        console.log("Start search at:", current);

        while (current.next !== null && current.next.data !== data) {
            console.log("Looking at:", current.data, "| Next node:", current.next.data);
            current = current.next;
        }

        // If found
        if (current.next !== null) {
            console.log("Found node to delete:", current.next.data);
            current.next = current.next.next;
            console.log("Now", current.data, "points to", current.next);
        } else {
            console.log("Data NOT found!");
        }

        console.log("---------------------");
    }
}


let list = new LinkedList();

list.add(10);
list.add(30);


list.delete(30);
/**
 * Here the file we implementing queue data structure using JavaScript.
 * A queue is a linear data structure that follows the First In First Out (FIFO) principle.
 * Elements are added to the back of the queue and removed from the front.
 * Enqueue operation adds an element to the back of the queue.
 * Dequeue operation removes an element from the front of the queue.
 * @author Meganathan
 */

class Queue {

    front = 0;
    rear = -1;
    size = 0;
    arr = [];

    // method for adding an element to the queue
    enqueue(element) {
        this.rear++;
        this.arr[this.rear] = element;
        this.size++;
    };

    // method for removing an element from the queue
    dequeue() {
        if (this.size === 0) return null;
        // [1,5,10]
        const element = this.arr[this.front]; // get the front element which means 1
        this.front++;
        return element;
    }

    show() {
        for (let i = this.front; i < this.size; i++) {
            console.log(this.arr[i]);
        }
    }

}

const queue = new Queue();
queue.enqueue(10);
queue.enqueue(20);

queue.dequeue();
queue.enqueue(30);
queue.enqueue(40);
console.log(queue.show());


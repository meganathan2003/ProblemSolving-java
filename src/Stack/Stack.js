/**
 * Here the code where Stack related functionalities will be implemented.
 * @module Stack
 * @author Meganathan
 */


class Stack {
    constructor() {
        this.arr = [];
    }

    // check the isempty method
    isEmpty() {
        return this.arr.length === 0;
    };

    // method for push the element
    push(element) {
        this.arr.push(element);

    }

    // method for pop the element
    pop() {
        // Check if stack is empty
        if (this.isEmpty()) {
            return "Stack is empty";
        }
        return this.arr.pop();
    }

    // method for print the stack
    printStack() {
        console.log(this.arr);
    }
    // Method for peek the element
    peek() {
        if (this.isEmpty()) {
            return "Stack is empty";
        }
        else {
            return this.arr[this.arr.length - 1]; // Peek the top elements
        }
    };



    // Method for size of the stack
    size() {
        return this.arr.length;
    }
}

let stack = new Stack();
stack.push(1);
stack.push(2);
stack.push(3);
stack.printStack();

console.log("Top element is: " + stack.peek());

console.log("Stack size is: " + stack.size());
console.log("Popped element is: " + stack.pop());
stack.printStack();

console.log("Is stack empty? " + stack.isEmpty());




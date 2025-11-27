/**
 * Here the code where Stack related functionalities will be implemented.
 * @module Stack
 * @author Meganathan
 */


class Stack {
    constructor() {
        this.arr = [];
        this.top = -1;
    }

    push(data) {
        this.top++;
        if (size < this.arr.length) {
            this.arr[this.top] = data;
        }
        else {
            console.log("Stack overflow");

        }
    }

    // print the stack values
    printStack() {
        for (let i = this.top; i >= 0; i--) {
            console.log(this.arr[i]);
        }
    }
}

let stack = new Stack();
stack.push(1);
stack.push(2);
stack.push(3);
stack.printStack();




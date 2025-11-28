/**
 * Here we have to implement a binary tree structure in JavaScript.
 * Each node in the binary tree will have a value, a left child, and a right child.
 * We will also implement methods to insert values into the tree and to perform an in-order traversal.
 * The in-order traversal will return the values in sorted order.
 * The in-order traversal will also return the values in sorted order.
 * @author Meganathan
 */

class Node {
    constructor(value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {

    constructor() {
        this.root = null;
    }

    // method for insert the value
    insert(value) {

        if (this.root === null) {
            this.root = new Node(value);
        }
        else if (value < this.root.value) {
            if (this.root.left === null) {
                this.root.left = new Node(value);
            }
            else {
                this._insertRecursively(this.root.left, value);
            }
        }
        else {
            if (this.root.right === null) {
                this.root.right = new Node(value);
            }
            else {
                this._insertRecursively(this.root.right, value);
            }
        }
    }

    _insertRecursively(node, value) {
        if (value < node.value) {
            if (node.left === null) {
                node.left = new Node(value);
            }
            else {
                this._insertRecursively(node.left, value);
            }
        }
        else {
            if (node.right === null) {
                node.right = new Node(value);
            }
            else {
                this._insertRecursively(node.right, value);
            }
        }
    }
}


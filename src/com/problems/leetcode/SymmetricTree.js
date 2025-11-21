
/**
 * Write the definition of the 
 * treenode
 * 
 */
class TreeNode {

    constructor(val, left = null, right = null) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

function isSymmetric(root) {

    if (!root) return true;
    return isMirror(root.left, root.right);
}


function isMirror(t1, t2) {


    // check the base conditon
    if (!t1 && !t2) return true;
    if (!t1 || !t2) return false;
    if (t1.val !== t2.val) return false;


    // Check mirror condition recursively
    return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);

}

const root = new TreeNode(1);
root.left = new TreeNode(2, new TreeNode(3), new TreeNode(4));
root.right = new TreeNode(2, new TreeNode(4), new TreeNode(3));

console.log(isSymmetric(root));


package com.problems.easy.Arrays;

class TreeNode {

    // create a definition of binary tree
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class TreeNodeExample {

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        // base case
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        if (q.val != p.val) {
            return false; // value does not match
        }

        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }

    public static void main(String[] args) {

        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        // Create tree q: [1, 2, 3]
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(4);

        System.out.println(isSameTree(p, q));

    }

}

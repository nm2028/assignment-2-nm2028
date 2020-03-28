/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    public static StringBuilder stringBuilder;
    public int levels = 0;
    public TreeNode root;

    public MyBinarySearchTree() {
        this.root = null;
        stringBuilder = new StringBuilder();
    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        stringBuilder.append(root.getKey() + " ");
        preOrder(root.getLeftChild());
        preOrder(root.getRightChild());
    }

    public static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.getLeftChild());
        postOrder(root.getRightChild());
        stringBuilder.append(root.getKey() + " ");
    }

    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.getLeftChild());
        stringBuilder.append(root.getKey() + " ");
        inOrder(root.getRightChild());
    }

    public void add(final int value) {
        this.root = addService(this.root, value);
    }

    public TreeNode addService(final TreeNode treeRoot, final int addingValue) {

        if (treeRoot == null) {
            return new TreeNode(addingValue);
        }
        if (addingValue < treeRoot.getKey()) {
            treeRoot.setLeftChild(addService(treeRoot.getLeftChild(), addingValue));
        } else if (addingValue == treeRoot.getKey()) {
            return treeRoot;
        } else {
            treeRoot.setRightChild(addService(treeRoot.getRightChild(), addingValue));
        }
        return treeRoot;
    }
}



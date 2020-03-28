/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree tree = new MyBinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        int i = 10;
        while (i > 0) {
            tree.add(scanner.nextInt());
            i--;
        }
        MyBinarySearchTree.preOrder(tree.root);
        System.out.println();
        MyBinarySearchTree.postOrder(tree.root);
    }
}

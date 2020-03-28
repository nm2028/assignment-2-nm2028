/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;
import problem5.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enQueue(new Node(new Student(14, "Nikhil")));
        queue.enQueue(new Node(new Student(8, "Ved")));
        queue.enQueue(new Node(new Student(35, "Om")));
        queue.enQueue(new Node(new Student(1, "Mayank")));
        queue.enQueue(new Node(new Student(16, "Rajan")));
        queue.printQueue();


    }
}

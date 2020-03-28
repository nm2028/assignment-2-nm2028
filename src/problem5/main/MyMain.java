/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

import java.util.ArrayList;

//executable class
public class MyMain {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Nikhil", 0, 7));
        studentList.add(new Student(2, "Thor", 2, 1));
        studentList.add(new Student(3, "Hulk", 7, 3));
        studentList.add(new Student(4, "IronMan", 1, 5));
        studentList.add(new Student(5, "Dr_Strange", 5, 2));
        MyCircularQueue queue = new MyCircularQueue();
        queue.enQueue(studentList);
        queue.printQueue();
    }
}

/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

import java.util.ArrayList;

//to implement circular queue
public class MyCircularQueue {
    private Node rear;
    private Node front;
    private int size;

    public MyCircularQueue() {
        rear = null;
        front = null;
        size = 0;
    }

    public void enQueue(ArrayList<Student> addData) {
        for (Student student : addData) {
            if (student.getBackLogCounter() - student.getAppearingCounter() > 0) {
                Node temp = new Node(student);
                if (this.front == null) {
                    front = temp;
                    temp.setNext(temp);
                    size++;
                } else {
                    temp.setNext(this.front);
                    Node temp1 = this.front;
                    while (temp1.getNext() != this.front) {
                        temp1 = temp1.getNext();
                    }
                    temp1.setNext(temp);
                    front = temp;
                    size++;
                }
            } else {
                System.out.println("data invalid");
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void printQueue() {
        Node temp = this.front;
        for (int i = 0; i < this.size; i++) {
            if (i != size - 1) {
                System.out.println(temp.getData().toString());
                temp = temp.getNext();

            } else {
                System.out.println(temp.getData().toString());
            }
        }
    }
}

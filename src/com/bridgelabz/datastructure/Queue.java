package com.bridgelabz.datastructure;

public class Queue {
    Node front;
    Node rear;

    // add data into the Queue
    public void enQueue(int data) {
        if (front == null) {
            rear = new Node(data);
            front = rear;
        } else {
            rear.next = new Node(data);
            rear = rear.next;
        }

    }

    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }

    }
}
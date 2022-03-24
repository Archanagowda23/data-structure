package com.bridgelabz.datastructure;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Queue Problem....!!!\n");
        Queue queue = new Queue();

        System.out.println("Element present in the Queue");
        queue.enQueue(50);
        queue.enQueue(40);
        queue.enQueue(60);
        queue.display();

        System.out.println();
        System.out.println("After deleting element from the queue");
        queue.deQueue();
        queue.display();
    }
}
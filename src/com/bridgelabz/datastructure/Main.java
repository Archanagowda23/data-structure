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

        System.out.println();
        System.out.println("\nWelcome to Stack Problem....!!!");
        Stack stack = new Stack();

        System.out.println();
        System.out.println("Element present in the Stack");
        stack.push(60);
        stack.push(40);
        stack.push(50);
        stack.display();

        // print Top element of Stack
        System.out.println();
        System.out.println("After deleting element from the stack");
        stack.pop();
        stack.display();
        System.out.printf("\nTop element is %d\n", stack.peek());

        System.out.println();
        System.out.println("After deleting element from the stack");
        stack.pop();
        stack.display();
        System.out.printf("\nTop element is %d\n", stack.peek());

        System.out.println();
        System.out.println("After deleting element from the stack");
        stack.pop();
        stack.display();
        System.out.printf("\nTop element is %d\n", stack.peek());

    }
}
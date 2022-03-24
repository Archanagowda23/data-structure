package com.bridgelabz.datastructure;

public class Stack {

    Node top;

    Stack() {
        this.top = null;
    }
    // Pushing element on the top of the stack

    public void push(int data) {
        Node newNode = new Node(data);

        if (newNode == null) {
            System.out.println("\nStack Overflow");
            return;
        }

        newNode.data = data;

        newNode.next = top;

        top = newNode;

    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty() {
        return top == null;
    }

    // Utility function to return top element in a stack
    public int peek() {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    // Utility function to pop top element from the stack
    public void pop() // remove at the beginning
    {
        // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
        // update the top pointer to point to the next node
        top = (top).next;
    }

    public void display() { // print method
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }

    }
}
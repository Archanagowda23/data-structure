package com.bridgelabz.datastructure;

public class LinkedList {

    Node head;
    Node tail;

    public void addNode(int data) {
        // Create a new node
        Node newNode = new Node(data); // IDNode

        // Checks if the list is empty
        if (head == null) {
            // If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else
        {
            // newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            // newNode will become new tail of the list
            tail = newNode;
        }
    }
    public void display() {
        // Node current will point to head
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of linked list: ");
        while (current != null) {
            // Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to linkedlist program");
        LinkedList sList = new LinkedList();

        // Add nodes to the list
        sList.addNode(56);
        sList.addNode(70);
        sList.addNode(30);
        sList.addNode(60);

        System.out.println("\nCreated Linked list is: ");
        sList.display();
    }
}

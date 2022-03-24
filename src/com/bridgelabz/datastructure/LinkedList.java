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
        //System.out.println("Nodes of linked list: ");
        while (current != null) {
            // Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public int searchNode(int data) {
        Node current = head;
        int i = 1;
        //Checks whether list is empty
        if(head == null) {
            System.out.println("List is empty");
        }
        else {
            while(current != null) {
                //Compares node to be found with each node present in the list
                if(current.data == data) {
                    System.out.println(current.data+" Element is present in the list at the position : " + i);
                    break;
                }
                i++;
                current = current.next;
            }
        }
        return data;
    }
    void delete(int position)
    {
        // If linked list is empty
        if (head == null)
            return;

        // Store head node
        Node temp = head;

        // If head needs to be removed
        if (position == 0)
        {
            head = temp.next;   // Change head
            return;
        }

        // Find previous node of the node to be deleted
        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;

        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;

        temp.next = next;  // Unlink the deleted node from list
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

        System.out.println();
        sList.searchNode(30);

        sList.delete(0);
        System.out.println("\nLinked List after Deletion : ");
        sList.display();
    }
}

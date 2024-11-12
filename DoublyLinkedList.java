package internal;

import java.util.Scanner;

class LinkedListNode {
    int data;
    LinkedListNode prev;
    LinkedListNode next;

    LinkedListNode(int value) {
        this.data = value;
    }

    void display() {
        System.out.println(data);
    }
}

class LinkedList {
    private LinkedListNode firstNode, lastNode;

    LinkedList() {
        firstNode = null;
        lastNode = null;
    }

    /* Insert node at the beginning */
    void insertFront(int value) {
        LinkedListNode node = new LinkedListNode(value);
        if (firstNode == null) {
            firstNode = lastNode = node;
            System.out.println("Linked list created successfully!");
        } else {
            node.next = firstNode;
            firstNode.prev = node;
            firstNode = node;
            System.out.println("Node inserted at the front of the linked list!");
        }
    }

    /* Insert node at the end */
    void insertEnd(int value) {
        LinkedListNode node = new LinkedListNode(value);
        if (firstNode == null) {
            firstNode = lastNode = node;
            System.out.println("Linked list created successfully!");
        } else {
            node.prev = lastNode;
            lastNode.next = node;
            lastNode = node;
            System.out.println("Node inserted at the end of the linked list!");
        }
    }

    /* Delete node from linked list by position */
    void delete() {
        if (firstNode == null) {
            System.out.println("The list is empty, nothing to delete.");
            return;
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the position of the node to delete (1 for first node): ");
        int position = Integer.parseInt(input.nextLine());

        int count = getNodeCount();
        if (position < 1 || position > count) {
            System.out.println("Invalid node position!");
            return;
        }

        LinkedListNode current = firstNode;
        for (int i = 1; i < position; i++) {
            current = current.next;
        }

        if (current == firstNode) {
            firstNode = firstNode.next;
            if (firstNode != null) firstNode.prev = null;
        } else if (current == lastNode) {
            lastNode = lastNode.prev;
            if (lastNode != null) lastNode.next = null;
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        System.out.println("Node deleted successfully!");
    }

    /* Display linked list */
    void display() {
        if (firstNode == null) {
            System.out.println("The list is empty.");
            return;
        }

        System.out.println("Nodes in ascending order:");
        LinkedListNode node = firstNode;
        while (node != null) {
            node.display();
            node = node.next;
        }

        System.out.println("Nodes in descending order:");
        node = lastNode;
        while (node != null) {
            node.display();
            node = node.prev;
        }
    }

    /* Count nodes in linked list */
    private int getNodeCount() {
        int count = 0;
        LinkedListNode temp = firstNode;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Insert at front 2. Insert at end 3. Delete 4. Display 5. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter the value to insert at the front: ");
                    list.insertFront(Integer.parseInt(input.nextLine()));
                    break;
                case 2:
                    System.out.print("Enter the value to insert at the end: ");
                    list.insertEnd(Integer.parseInt(input.nextLine()));
                    break;
                case 3:
                    list.delete();
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 5);

        input.close();
    }
}

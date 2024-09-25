package sumedha_practice;
//Node class for the doubly linked list
//Node class for the doubly linked list
class Node {
 int data;
 Node prev;
 Node next;

 // Constructor
 public Node(int data) {
     this.data = data;
     this.prev = null;
     this.next = null;
 }
}

//DoublyLinkedList class
class DoublyLinkedList {
 private Node head;

 // Method to insert a new node at the end of the list
 public void insert(int data) {
     Node newNode = new Node(data);
     if (head == null) {
         head = newNode;
     } else {
         Node temp = head;
         while (temp.next != null) {
             temp = temp.next;
         }
         temp.next = newNode;
         newNode.prev = temp;
     }
 }

 // Method to delete a node with the given value
 public void delete(int data) {
     if (head == null) {
         System.out.println("List is empty. Cannot delete.");
         return;
     }

     Node temp = head;

     // If the node to be deleted is the head node
     if (head.data == data) {
         head = head.next;
         if (head != null) {
             head.prev = null;
         }
         return;
     }

     // Traverse the list to find the node to delete
     while (temp != null && temp.data != data) {
         temp = temp.next;
     }

     // If the node to be deleted is not found
     if (temp == null) {
         System.out.println("Element not found in the list.");
         return;
     }

     // Update the pointers to remove the node
     if (temp.next != null) {
         temp.next.prev = temp.prev;
     }
     if (temp.prev != null) {
         temp.prev.next = temp.next;
     }
 }

 // Method to display the list contents
 public void display() {
     if (head == null) {
         System.out.println("List is empty.");
         return;
     }

     Node temp = head;
     System.out.print("List contents: ");
     while (temp != null) {
         System.out.print(temp.data + " ");
         temp = temp.next;
     }
     System.out.println();
 }
}

//Main class
public class doublyLL {
 public static void main(String[] args) {
     DoublyLinkedList list = new DoublyLinkedList();

     // Inserting elements into the doubly linked list
     list.insert(10);
     list.insert(20);
     list.insert(30);
     list.insert(40);
     list.insert(50);

     // Display the list before deletion
     System.out.println("Before deletion:");
     list.display();

     // Deleting an element from the list
     list.delete(30);

     // Display the list after deletion
     System.out.println("After deletion:");
     list.display();
 }
}

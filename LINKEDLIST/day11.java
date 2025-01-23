package LINKEDLIST;

public class day11 {
  class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value; // Value stored in the node
      this.next = null;   // Pointer to the next node
    }
  }
  
  class LinkedList {
    Node head;
    int size;

    LinkedList() {
      this.head = null; // Start of the linked list
      this.size = 0;    // Number of nodes in the list
    }
  
    // Insert a node at a specific index
    void insertAt(int value, int index) {
      if (index < 0 || index > this.size) {
        System.out.println("Invalid index");
        return;
      }
  
      Node newNode = new Node(value);
  
      if (index == 0) {
        // Insert at the head
        newNode.next = this.head;
        this.head = newNode;
      } else {
        // Traverse to the node before the specified index
        Node current = this.head;
        Node previous = null;
        int i = 0;
  
        while (i < index) {
          previous = current;
          current = current.next;
          i++;
        }
  
        // Insert the new node
        newNode.next = current;
        previous.next = newNode;
      }
  
      this.size++;
    }
  
    // Print the list as an array
    void print() {
      java.util.ArrayList<Integer> result = new java.util.ArrayList<>();
      Node current = this.head;
      while (current != null) {
        result.add(current.value);
        current = current.next;
      }
      System.out.println(result);
    }
  }
  
  // Main function
  public static void main(String[] args) {
    LinkedList list = new day11().new LinkedList();
  
    list.insertAt(10, 0); // Insert 10 at index 0
    list.insertAt(20, 1); // Insert 20 at index 1
    list.insertAt(15, 1); // Insert 15 at index 1 (between 10 and 20)
    list.insertAt(5, 0);  // Insert 5 at index 0 (new head)
  
    list.print(); // Output: [5, 10, 15, 20]
  }
}

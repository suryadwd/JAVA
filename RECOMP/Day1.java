package RECOMP;

// Define the Node class (should only contain data and next)
class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}

// Define the Linked List class
class LinkedList {
  Node head;
  Node tail;
  int size;

  // Constructor to initialize an empty list
  LinkedList() {
    this.head = null;
    this.tail = null;
  }

  // Insert at the end of the linked list


void insertAtEnd(int val) {
    Node temp = new Node(val);

    if (head == null)
      head = tail = temp;
    else {
      tail.next = temp;
      tail = temp;
    }

    size++;

  }

  void print() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  }

  void printRecursivestr(Node node) {
    if (node == null)
      return;
    System.out.print(node.data + " ");
    printRecursivestr(node.next);
  }

  void printRecursive() {
    printRecursivestr(head);
  }

  void countSize() {
    Node temp = head;
    while (temp != null) {
      size++;
      temp = temp.next;
    }
    System.out.println(size);

    // insted we can directly use the sout(size) also it will do thre same thing

  }


void insertAtHead(int val) {
  Node temp = new Node(val);
  
  if(head == null) head = tail = temp;
  else{
    temp.next = head;
   head = temp;
  }

}
}

public class Day1 {
  public static void main(String[] args) {
    LinkedList list = new LinkedList(); // Now using LinkedList instead of Node

    list.insertAtEnd(10);
    list.insertAtEnd(20);
    list.insertAtEnd(30);

    list.print();
    // list.countSize();

    list.insertAtHead(50);
    list.insertAtHead(60);
    list.insertAtHead(70);

    list.print();

    // System.out.println(list.size);

  }
}

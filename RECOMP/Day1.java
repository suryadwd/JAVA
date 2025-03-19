package RECOMP;

/* 
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

    if (head == null)
      head = tail = temp;
    else {
      temp.next = head;
      head = temp;
    }
    size++;
  }

  void insertAtAny(int pos, int val) {

    if (pos < 0 || pos > size) {
      System.out.println("Invalid position!");
      return;
    }

    if (pos == 0) {
      insertAtHead(val);
      return;
    }

    if (pos == size) {
      insertAtEnd(val);
      return;
    }

    int cnt = 0;
    Node temp = head;
    Node newNode = new Node(val);
    while (cnt < pos - 1) {
      cnt++;
      temp = temp.next;
    }

    newNode.next = temp.next;
    temp.next = newNode;

    if (newNode.next == null)
      tail = newNode;

    size++;

  }

  void deleteAny(int pos) {

    if (head == null) {
      System.out.println("Alredy empty");
      return;
    }
    // delete head
    if (pos == 1) {
      head = head.next;
      if (head == null)
        tail = null;
        size--;
        return;
    }

    // delete tail
    if (pos == size) {
      int cnt = 1;
      Node temp = head;
      while (cnt < pos - 1) {
        cnt++;
        temp = temp.next;
      }
      temp.next = null;
      tail = temp;
      size--;
      return;
    }


    //delete from the middle
    Node temp = head;
    int cnt = 1;
    while(cnt < pos-1){
      cnt++;
      temp = temp.next;
    }
    temp.next = temp.next.next;
    size--;
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
    // System.out.println(list.size);

    list.insertAtHead(50);
    list.insertAtHead(60);
    list.insertAtHead(70);

    list.print();

    // System.out.println("Inserting at 3 with 0");

    // list.insertAtAny(3, 0);
    // list.print();


    // System.out.println("Deleting from start");
    // list.deleteAny(1);
    // list.print();
    // System.out.println("Deleting from end");
    // list.deleteAny(list.size);
    // list.print();
    // System.out.println("Deleting at mid");
    // list.deleteAny(2);
    // list.print();

    

  }


}

*/

//revising the linked list

class Node{
  int data;
  Node next;

  Node(int val){
    this.data = val;
    this.next = null;
  }
}

class LinkedList{
  Node head;
  Node tail;
  int size;

  LinkedList(){
    this.head = null;
    this.tail = null;
    this.size = 0;
  }


void insertAtEnd(int val) {
  Node temp = new Node(val);
  if(head == null) head = tail = temp;
  else{
    tail.next = temp;
    tail = temp;
  }
  size++;
}

void insertAtHead(int val){
  Node temp = new Node(val);
  if(head == null) head = tail = temp;
  else{
    temp.next = head;
    head = temp;
  }
  size++;
}

void insertAtAny(int pos, int val){
  if(pos<0) throw new Error("Position must be positive");

  if(pos == 1) insertAtHead(val);

  if(pos == size) insertAtEnd(val);

  int cnt = 0;
  Node temp = head;

  while(cnt < pos - 1){
    temp = temp.next;
    cnt++;
  }

  Node newVal = new Node(val);

  newVal.next = temp.next; //pahle purne wale ko save kro
  temp.next = newVal; // fir naye ko add karo

  if (newVal.next == null) tail = newVal;

  size++;

}

void deleteAny(int pos){
  
  if(pos < 0 || pos > size){
    System.out.println("Invalid position");
    return;
  }

  if(head == null) {
    System.out.println("Already empty");
    return;
  }

  if(pos == 1){
    head = head.next;
    if(head == null) tail = null;
    size--;
    return;
  }

  if(pos == size){
    int cnt = 1;
    Node temp = head;
    while (cnt < pos - 1) {
      temp = temp.next;
      cnt++;
    }
    temp.next = null;
    size--;
    tail = temp;
    return;
  }

  int cnt = 1;
  Node temp = head;

  while(cnt < pos-1){
    temp = temp.next;
    cnt++;
  }

  temp.next = temp.next.next;
  size--;

}

void print(){
  Node temp = head;
  while(temp != null){
    System.out.print(temp.data+" ");
    temp = temp.next;
  }
  System.out.println();
}

void middle(){

  // Node temp = head;
  // int length = 0;
  // while (temp != null) {
  //   length++;
  //   temp = temp.next;
  // }
  // int pos = 0;
  // // odd check 
  // if(length % 2 != 0) pos =(length/2) + 1;
  // // even check
  // if(length % 2 == 0) pos =(length/2) + 1;

  // int cnt = 1;
  // temp = head;

  // while(temp != null){
  //   if(cnt == pos)System.out.println(temp.data);
  //   temp = temp.next;
  //   cnt++;
  // }

 // now using the two pointer method approh to do it without findning the size

  Node low = head, high = head;

  //in while for odd high.next! = null while for even high != null

    //agar high.next pahle lik dege to error aa jayega kyu ki null.next kuch hota nai hai agar high null hoga to

  while( high != null && high.next != null ){
    low = low.next;
    high = high.next.next;
  }

  System.out.println(low.data);

}

void intersect(){
  
}

}

public class Day1 {

  public static void main(String[] args) {
    LinkedList list = new LinkedList(); 

    /*
    list.insertAtEnd(10);
    list.insertAtEnd(20);
    list.insertAtEnd(30);
    list.print();

    list.insertAtHead(1);
    list.insertAtHead(2);
    list.insertAtHead(3);
    list.print();

    list.insertAtAny(3, 0);
    list.print();

    list.deleteAny(2);
    list.print();

   

    System.out.println("Print the middle of the node");

    list.insertAtEnd(10);
    list.insertAtEnd(20);
    list.insertAtEnd(30);
    list.insertAtEnd(40);
    list.insertAtEnd(50);
    list.insertAtEnd(60);
    list.insertAtEnd(70);
    list.insertAtEnd(80);
    list.insertAtEnd(90);

    list.middle();
     */

    System.out.println("Removing the nth last element of the node");
    list.insertAtEnd(10);
    list.insertAtEnd(20);
    list.insertAtEnd(30);

    list.insertAtHead(1);
    list.insertAtHead(2);
    list.insertAtHead(3);
    list.insertAtHead(55);
    list.print();

    



  }

}

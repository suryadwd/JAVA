package Dailyjava;


class Node{
  int data;
  Node next;

  Node(int v){
    this.data = v;
    this.next = null;
  }

}

class SLL{
  Node head;
  Node tail;
  int size;

  SLL(){
    this.head = null;
    this.tail = null;
    size = 0;
  }

  void insertAtEnd(int value){
    Node temp = new Node(value);
    if(head == null) head = tail = temp;
    else{
      tail.next=temp;
    tail = temp;
    size++;
    }
  }

  void printN(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.data+" ");
      temp = temp.next;
    }
  }

}


public class Main {
    public static void main(String[] args) {
      SLL ll = new SLL();
      ll.insertAtEnd(1);
      ll.insertAtEnd(2);
      ll.insertAtEnd(3);
      ll.insertAtEnd(4);
      ll.insertAtEnd(5);
      ll.printN();
    }
}

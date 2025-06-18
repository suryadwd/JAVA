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
    System.out.println();
  }

  void printRec(Node head){
    Node temp = head;
    if(temp == null) return;
    System.out.print(temp.data+" ");
    printRec(temp.next);
  }

  void insertAtHead(int value){
    Node temp = new Node(value);
    if(head == null) head = tail = temp;
    else{
      temp.next = head;
      head = temp;
    }
    size++;
  }

  void insertAtAny(int idx, int value){
    Node add = new Node(value);
    Node temp = head;
    int pos = 1;
    while(pos < idx){
      temp = temp.next;
      pos++;
    }
    add.next = temp.next;
    temp.next = add;
  }

  void get(int idx){
    Node temp = head;
    int pos = 1;
    while(pos != idx){
      temp = temp.next;
      pos++;
    }
    System.out.println(temp.data);
  }

  void set(int idx, int value){
    Node temp = head;
    int pos = 1;
    while (pos != idx) {
      temp = temp.next;
      pos++;
    }
    temp.data = value;
    System.out.println(temp.data);
  }

  void deleteAtHead(){
    head = head.next;
  }

  void delete(int idx){
      Node temp = head;
      if (idx == 1) deleteAtHead();
      int pos = 1;
      while(pos < idx){
        temp = temp.next;
        pos++;
      }
      if(temp.next == tail) tail = temp;
      temp.next = temp.next.next;
  }

  void middleEle(Node head){
    Node slow = head;
    Node fast = head;
    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    System.out.println("Middle node"+slow.data);
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

      // ll.printN();
      // ll.insertAtHead(9);
      // ll.insertAtHead(8);
      // ll.insertAtHead(7);
      // ll.insertAtAny(3,69);
      // ll.printN();
      // ll.get(4);
      // ll.set(4,0);
      // ll.printN();
      // ll.deleteAtHead();
      // ll.insertAtAny(3,69);
      // ll.printN();
      // ll.delete(4);

      // ll.printN();
      

    }
}


// leetcode 83

// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode slow = head;
//         ListNode fast = head;

//         while(fast != null && fast.next != null){
//             fast = fast.next;
//             if(slow.val == fast.val){
//                if(fast.next != null){
//                  while(fast.next != null && fast.val == slow.val){
//                     fast = fast.next;
//                     slow.next = slow.next.next;
//                  }
//                }else{
//                 slow.next = null;
//                }
//             }
//             slow = slow.next;
//         }
//             return head;
//     }
// }